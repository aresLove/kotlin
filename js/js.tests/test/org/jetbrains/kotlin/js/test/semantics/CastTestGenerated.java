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

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/expression/cast/cases")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CastTestGenerated extends AbstractCastTest {
    public void testAllFilesPresentInCases() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/expression/cast/cases"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("castExtensionToKMutableProperty.kt")
    public void testCastExtensionToKMutableProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castExtensionToKMutableProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("castExtensionToKProperty1.kt")
    public void testCastExtensionToKProperty1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castExtensionToKProperty1.kt");
        doTest(fileName);
    }

    @TestMetadata("castToAny.kt")
    public void testCastToAny() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToAny.kt");
        doTest(fileName);
    }

    @TestMetadata("castToArray.kt")
    public void testCastToArray() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToArray.kt");
        doTest(fileName);
    }

    @TestMetadata("castToFunction.kt")
    public void testCastToFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("castToGenericType.kt")
    public void testCastToGenericType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToGenericType.kt");
        doTest(fileName);
    }

    @TestMetadata("castToGenericTypeWithMultipleUpperBounds.kt")
    public void testCastToGenericTypeWithMultipleUpperBounds() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToGenericTypeWithMultipleUpperBounds.kt");
        doTest(fileName);
    }

    @TestMetadata("castToGenericTypeWithUpperBound.kt")
    public void testCastToGenericTypeWithUpperBound() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToGenericTypeWithUpperBound.kt");
        doTest(fileName);
    }

    @TestMetadata("castToKMutableProperty0.kt")
    public void testCastToKMutableProperty0() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToKMutableProperty0.kt");
        doTest(fileName);
    }

    @TestMetadata("castToKMutableProperty1.kt")
    public void testCastToKMutableProperty1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToKMutableProperty1.kt");
        doTest(fileName);
    }

    @TestMetadata("castToKProperty0.kt")
    public void testCastToKProperty0() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToKProperty0.kt");
        doTest(fileName);
    }

    @TestMetadata("castToKProperty1.kt")
    public void testCastToKProperty1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToKProperty1.kt");
        doTest(fileName);
    }

    @TestMetadata("castToNotNull.kt")
    public void testCastToNotNull() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToNotNull.kt");
        doTest(fileName);
    }

    @TestMetadata("castToNullable.kt")
    public void testCastToNullable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/castToNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("implicitCastToLong.kt")
    public void testImplicitCastToLong() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/implicitCastToLong.kt");
        doTest(fileName);
    }

    @TestMetadata("noRuntimeTypeCheck.kt")
    public void testNoRuntimeTypeCheck() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/noRuntimeTypeCheck.kt");
        doTest(fileName);
    }

    @TestMetadata("primitiveToClass.kt")
    public void testPrimitiveToClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/primitiveToClass.kt");
        doTest(fileName);
    }

    @TestMetadata("reifiedToNotNull.kt")
    public void testReifiedToNotNull() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/reifiedToNotNull.kt");
        doTest(fileName);
    }

    @TestMetadata("reifiedToNullable1.kt")
    public void testReifiedToNullable1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/reifiedToNullable1.kt");
        doTest(fileName);
    }

    @TestMetadata("reifiedToNullable2.kt")
    public void testReifiedToNullable2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/reifiedToNullable2.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCastToGenericTypeWithUpperBound.kt")
    public void testSafeCastToGenericTypeWithUpperBound() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/safeCastToGenericTypeWithUpperBound.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCastToNotNull.kt")
    public void testSafeCastToNotNull() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/safeCastToNotNull.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCastToNullable.kt")
    public void testSafeCastToNullable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/safeCastToNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCastToReifiedNotNull.kt")
    public void testSafeCastToReifiedNotNull() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/safeCastToReifiedNotNull.kt");
        doTest(fileName);
    }

    @TestMetadata("safeCastToReifiedNullable.kt")
    public void testSafeCastToReifiedNullable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/safeCastToReifiedNullable.kt");
        doTest(fileName);
    }

    @TestMetadata("smartCastInExtensionFunction.kt")
    public void testSmartCastInExtensionFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/smartCastInExtensionFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("smartCastInFunction.kt")
    public void testSmartCastInFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/expression/cast/cases/smartCastInFunction.kt");
        doTest(fileName);
    }
}
