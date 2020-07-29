package kotlinParser

import DocumentationConstants
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiFile
import com.intellij.util.text.CharArrayUtil
import org.apache.commons.lang.StringUtils
import org.jetbrains.kotlin.psi.KtNamedFunction


class KDocPsiParser(private val mFile: PsiFile, private val mDocument: Document, private  val mCaretOffset: Int) : IPsiParser {

    companion object {
        private const val KDOC_OPEN_MAX_MARGIN = 4
        private const val ANNOTATION_THROWS_DECLARATION = "Throws"
        private const val PARENTHESIS_CLOSE = ")"
        private const val PARENTHESIS_OPEN = "("
    }

    /**
     * extracts the parameters from a kotlin named function
     *
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
     *
     * @param ktNamedFunction: the kotlin function whose exceptions need to be parsed.
     * @return a list of the function exceptions by type.
     */
    private fun parseExceptionsList(ktNamedFunction: KtNamedFunction): ArrayList<String> {
        val exceptionsList = ArrayList<String>()
        ktNamedFunction.annotationEntries
                .filter { it.shortName.toString() == ANNOTATION_THROWS_DECLARATION }
                .forEach {
                    StringUtils.substringBetween(it.text, PARENTHESIS_OPEN, PARENTHESIS_CLOSE)
                            .split(",")
                            .forEach { exception ->
                        exceptionsList.add(exception.substringBefore(":"))
                    }
                }
        return exceptionsList
    }

    override fun shouldGenerateKDOC(): Boolean {
        val docChars = mDocument.charsSequence
        val offset = mCaretOffset
        val lastKDOCValidOpen = CharArrayUtil.lastIndexOf(docChars, DocumentationConstants.KDOC_OPEN_TOKEN, offset)
        if (lastKDOCValidOpen == -1) {
            // could not find /** for a KDOC. should not generate.
            return false
        }
        if (CharArrayUtil.indexOf(docChars, DocumentationConstants.KDOC_CLOSE_TOKEN, lastKDOCValidOpen) <= offset) {
            // verify if the kdoc has not been closed
            return false
        }
        if (offset - lastKDOCValidOpen >= KDOC_OPEN_MAX_MARGIN) {
            // caret is outside the kdoc. do not generate
            return false
        }
        return true
    }

    override fun parse(): ParseResult {
        val emptyResult = ParseResult(emptyList(), emptyList(), false)
        // parent.parent will hold the function declaration or class declaration.
        val caretElement = mFile.findElementAt(mCaretOffset) ?: return emptyResult
        val firstParent = caretElement.parent ?: return emptyResult
        val secondParent = firstParent.parent ?: return emptyResult
        val functionDeclaration = secondParent as? KtNamedFunction ?: return emptyResult
        return ParseResult(
                parseParameterList(functionDeclaration),
                parseExceptionsList(functionDeclaration),
                functionDeclaration.hasDeclaredReturnType())
    }
}

