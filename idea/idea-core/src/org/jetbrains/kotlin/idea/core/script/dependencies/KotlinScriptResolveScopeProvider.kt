/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.core.script.dependencies

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.ResolveScopeProvider
import com.intellij.psi.search.GlobalSearchScope
import org.jetbrains.kotlin.idea.core.script.KotlinScriptConfigurationManager
import org.jetbrains.kotlin.script.KotlinConfigurableScriptDefinition
import org.jetbrains.kotlin.script.KotlinScriptDefinitionFromTemplate
import org.jetbrains.kotlin.script.StandardScriptDefinition
import org.jetbrains.kotlin.script.getScriptDefinition
import kotlin.script.StandardScriptTemplate

class KotlinScriptResolveScopeProvider : ResolveScopeProvider() {
    override fun getResolveScope(file: VirtualFile, project: Project): GlobalSearchScope? {
        val scriptDefinition = getScriptDefinition(file, project) ?: return null

        // This is a workaround for completion in scripts and REPL to provide module dependencies
        if (scriptDefinition == StandardScriptDefinition || scriptDefinition.template == Any::class) {
            return null
        }

        // TODO: this should get this particular scripts dependencies
        if (scriptDefinition is KotlinConfigurableScriptDefinition || scriptDefinition is KotlinScriptDefinitionFromTemplate) {
            // TODO: should include the file itself
            return KotlinScriptConfigurationManager.getInstance(project).getAllScriptsClasspathScope()
        }
        return null
    }
}