package kotlinParser

import DocumentationConstants
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiFile
import com.intellij.util.text.CharArrayUtil
import org.apache.commons.lang.StringUtils
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNamedFunction


class KDocPsiParser(private val mFile: PsiFile, private val mDocument: Document, private  val mCaretOffset: Int) : IPsiParser {

    companion object {
        private const val NO_VALID_KDOC_OPEN = -1
        private const val ANNOTATION_THROWS_DECLARATION = "Throws"
        private const val PARENTHESIS_CLOSE = ")"
        private const val PARENTHESIS_OPEN = "("
        private const val EXCEPTION_LIST_SEPARATOR = ","
        private const val EXCEPTION_TYPE_POSTFIX_DELIMITER = ":"
    }

    /**
     * extracts the parameters from a kotlin named function
     * @param ktNamedFunction: the kotlin function whose parameters need to be parsed.
     * @return a list of the function parameters by name.
     */
    private fun parseParameterList(ktNamedFunction: KtNamedFunction): ArrayList<String> {
        val typeParameters = ktNamedFunction.typeParameters.mapNotNull { it.name }
        val valueParameters = ktNamedFunction.valueParameters.mapNotNull { it.name }
        val fullArgumentsList = ArrayList<String>()
        fullArgumentsList.addAll(typeParameters)
        fullArgumentsList.addAll(valueParameters)
        return fullArgumentsList
    }

    /**
     * extracts the declared thrown exceptions from a kotlin named function
     * @param ktNamedFunction: the kotlin function whose exceptions need to be parsed.
     * @return a list of the function exceptions by type.
     */
    private fun parseExceptionsList(ktNamedFunction: KtNamedFunction): ArrayList<String> {
        val exceptionsList = ArrayList<String>()
        ktNamedFunction.annotationEntries
                .filter { it.shortName.toString() == ANNOTATION_THROWS_DECLARATION }
                .forEach {
                    StringUtils.substringBetween(it.text, PARENTHESIS_OPEN, PARENTHESIS_CLOSE)
                            .split(EXCEPTION_LIST_SEPARATOR)
                            .forEach { exception ->
                        exceptionsList.add(exception.substringBefore(EXCEPTION_TYPE_POSTFIX_DELIMITER))
                    }
                }
        return exceptionsList
    }

    override fun shouldGenerateKDOC(): Boolean {
        if (mFile !is KtFile) {
            return false
        }
        val docChars = mDocument.charsSequence
        val caretLocation = mCaretOffset
        val lastKDOCValidOpen = CharArrayUtil.lastIndexOf(docChars, DocumentationConstants.KDOC_OPEN_TOKEN, caretLocation)
        if (lastKDOCValidOpen == NO_VALID_KDOC_OPEN) {
            // could not find /** for a KDOC. should not generate.
            return false
        }
        if (CharArrayUtil.indexOf(docChars, DocumentationConstants.KDOC_CLOSE_TOKEN, lastKDOCValidOpen) <= caretLocation) {
            // verify if the kdoc has not been closed
            return false
        }
        return true
    }

    override fun parse(): ParseResult {
        val emptyResult = ParseResult(null, emptyList(), emptyList(), false)
        // parent.parent will hold the function declaration or class declaration.
        val caretElement = mFile.findElementAt(mCaretOffset) ?: return emptyResult
        val firstParent = caretElement.parent ?: return emptyResult
        val secondParent = firstParent.parent ?: return emptyResult
        val functionDeclaration = secondParent as? KtNamedFunction ?: return emptyResult
        return ParseResult(
                firstParent,
                parseParameterList(functionDeclaration),
                parseExceptionsList(functionDeclaration),
                functionDeclaration.hasDeclaredReturnType())
    }
}

