import documentationGenerator.DocumentationGenerator
import documentationGenerator.DocumentationGeneratorTestConstants
import documentationGenerator.DocumentationGeneratorTestConstants.FIRST_ARGUMENT_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.FIRST_EXCEPTION_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.SECOND_ARGUMENT_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.SECOND_EXCEPTION_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.THIRD_ARGUMENT_NAME
import documentationGenerator.DocumentationGeneratorTestConstants.THIRD_EXCEPTION_NAME
import org.junit.Test
import kotlin.test.assertEquals

class DocumentationGeneratorTest {

    companion object {
        private const val INDENTATION_AMOUNT = 1
    }

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
                DocumentationGenerator.generateDocumentation(noArgumentsList, noExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(oneArgumentList, noExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, noExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(threeArgumentList, noExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(noArgumentsList, oneExceptionList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(oneArgumentList, oneExceptionList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, oneExceptionList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(threeArgumentList, oneExceptionList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(noArgumentsList, twoExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(oneArgumentList, twoExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, twoExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(threeArgumentList, twoExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(noArgumentsList, threeExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(oneArgumentList, threeExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, threeExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsNoReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(threeArgumentList, threeExceptionsList, false, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(noArgumentsList, noExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(oneArgumentList, noExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, noExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueNoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_NO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(threeArgumentList, noExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(noArgumentsList, oneExceptionList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(oneArgumentList, oneExceptionList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, oneExceptionList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueOneException() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_ONE_EXCEPTION,
                DocumentationGenerator.generateDocumentation(threeArgumentList, oneExceptionList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(noArgumentsList, twoExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(oneArgumentList, twoExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, twoExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueTwoExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(threeArgumentList, twoExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateNoArgumentsWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(noArgumentsList, threeExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateOneArgumentWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(oneArgumentList, threeExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateTwoArgumentsWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(twoArgumentsList, threeExceptionsList, true, INDENTATION_AMOUNT))
    }

    @Test
    fun testGenerateThreeArgumentsWithReturnValueThreeExceptions() {
        assertEquals(DocumentationGeneratorTestConstants.EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS,
                DocumentationGenerator.generateDocumentation(threeArgumentList, threeExceptionsList, true, INDENTATION_AMOUNT))
    }

}