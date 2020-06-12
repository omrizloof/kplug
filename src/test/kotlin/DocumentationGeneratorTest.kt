package documentationGenerator

import documentationGenerator.DocumentationGeneratorTestConstants.FIRST_ARGUMENT_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.FIRST_EXCEPTION_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.SECOND_ARGUMENT_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.SECOND_EXCEPTION_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.THIRD_ARGUMENT_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.THIRD_EXCEPTION_NAME
import org.junit.Test
import kotlin.test.assertEquals

class DocumentationGeneratorTest {

    private val noArgumentsList = listOf<String>()
    private val oneArgumentList = listOf(FIRST_ARGUMENT_NAME)
    private val twoArgumentsList = listOf(FIRST_ARGUMENT_NAME, SECOND_ARGUMENT_NAME)
    private val threeArgumentList = listOf(FIRST_ARGUMENT_NAME, SECOND_ARGUMENT_NAME, THIRD_ARGUMENT_NAME)

    private val noExceptionsList = listOf<String>()
    private val oneExceptionList = listOf(FIRST_EXCEPTION_NAME)
    private val twoExceptionsList = listOf(FIRST_EXCEPTION_NAME, SECOND_EXCEPTION_NAME)
    private val threeExceptionsList = listOf(FIRST_EXCEPTION_NAME, SECOND_EXCEPTION_NAME, THIRD_EXCEPTION_NAME)

    @Test
    fun testGenerateNoArgumentsNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(noArgumentsList, false, noExceptionsList))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(oneArgumentList, false, noExceptionsList))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, false, noExceptionsList))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(threeArgumentList, false, noExceptionsList))
    }

    @Test
    fun testGenerateNoArgumentsNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(noArgumentsList, false, oneExceptionList))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(oneArgumentList, false, oneExceptionList))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, false, oneExceptionList))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(threeArgumentList, false, oneExceptionList))
    }

    @Test
    fun testGenerateNoArgumentsNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(noArgumentsList, false, twoExceptionsList))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(oneArgumentList, false, twoExceptionsList))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, false, twoExceptionsList))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(threeArgumentList, false, twoExceptionsList))
    }

    @Test
    fun testGenerateNoArgumentsNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(noArgumentsList, false, threeExceptionsList))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(oneArgumentList, false, threeExceptionsList))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, false, threeExceptionsList))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(threeArgumentList, false, threeExceptionsList))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(noArgumentsList, true, noExceptionsList))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(oneArgumentList, true, noExceptionsList))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, true, noExceptionsList))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(threeArgumentList, true, noExceptionsList))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(noArgumentsList, true, oneExceptionList))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(oneArgumentList, true, oneExceptionList))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, true, oneExceptionList))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_ONE_EXCEPTION,
            DocumentationGenerator.generateDocumentation(threeArgumentList, true, oneExceptionList))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(noArgumentsList, true, twoExceptionsList))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(oneArgumentList, true, twoExceptionsList))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, true, twoExceptionsList))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(threeArgumentList, true, twoExceptionsList))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(noArgumentsList, true, threeExceptionsList))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(oneArgumentList, true, threeExceptionsList))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(twoArgumentsList, true, threeExceptionsList))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
            DocumentationGenerator.generateDocumentation(threeArgumentList, true, threeExceptionsList))
    }

}