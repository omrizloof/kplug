package kotlinParser

import com.intellij.openapi.editor.*
import com.intellij.psi.*
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.text.*
import org.jetbrains.kotlin.idea.refactoring.changeSignature.getDeclarationBody
import org.jetbrains.kotlin.kdoc.psi.api.KDoc
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtTypeArgumentList


class KDocPsiParser(private val mFile: PsiFile, private val mDocument: Document, private  val mCaretOffset: Int) : IPsiParser {

    companion object {
        private const val KDOC_OPEN_MAX_MARGIN = 4
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

    private fun parseExceptionsList(ktNamedFunction: KtNamedFunction): ArrayList<String> {
        val throwAnnotation = ktNamedFunction.annotations.forEach {
            var x = 0
            x++
        }
        val exceptionsList = ArrayList<String>()
//        exceptionsList.addAll(ktNamedFunction.)
        return exceptionsList
    }

    override fun parse(): Boolean {
        val project = mFile.project
        // parent.parent will hold the function declaration or class declaration.
        val caretElement = mFile.findElementAt(mCaretOffset) ?: return false
        val firstParent = caretElement.parent ?: return false
        val secondParent = firstParent.parent ?: return false
        val functionDeclaration = secondParent as? KtNamedFunction ?: return false
        val parameters = parseParameterList(functionDeclaration)
        val exceptions = parseExceptionsList(functionDeclaration)
        val docChars = mDocument.charsSequence
        val offset = mCaretOffset
        val lastKDOCValidOpen = CharArrayUtil.lastIndexOf(docChars, DocumentationConstants.KDOC_OPEN_TOKEN, offset)
        if (lastKDOCValidOpen == -1) {
            // could not find /** for a KDOC. should not generate.
            return false
        }
        if (CharArrayUtil.indexOf(docChars, DocumentationConstants.KDOC_CLOSE_TOKEN, lastKDOCValidOpen) > offset) {
            // verify if the kdoc has not been closed - if it has been closed, we should not generate.
            return false
        }
//        if (offset - lastKDOCValidOpen < KDOC_OPEN_MAX_MARGIN) {
//            // caret is inside the kdoc. do not generate again
//            return false
//        }
        return true
    }

    override fun getArguments(): List<String> {
        TODO("Not yet implemented")
    }

    override fun getExceptions(): List<String> {
        TODO("Not yet implemented")
    }

    override fun hasReturnValue(): Boolean {
        TODO("Not yet implemented")
    }
}

