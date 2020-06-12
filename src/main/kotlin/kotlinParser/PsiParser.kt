package kotlinParser

import com.intellij.openapi.editor.Document
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiFile
import com.intellij.util.text.CharArrayUtil


class PsiParser(private val mFile: PsiFile, private val mDocument: Document, private  val mCaretOffset: Ref<Int>) {

    companion object {
        private const val KDOC_OPEN_MAX_MARGIN = 4
    }

    fun isKotlinFile(): Boolean {
//        return file is KtFile
        return true
    }

    fun shouldGenerateKDOC(): Boolean {
        val docChars = mDocument.charsSequence
        val offset = mCaretOffset.get()
        val lastKDOCValidOpen = CharArrayUtil.lastIndexOf(docChars, DocumentationConstants.KDOC_OPEN_TOKEN, offset)
        if (lastKDOCValidOpen == -1) {
            // could not find /** for a KDOC. should not generate.
            return false
        }
        if (CharArrayUtil.indexOf(docChars, DocumentationConstants.KDOC_CLOSE_TOKEN, lastKDOCValidOpen) > offset) {
            // verify if the kdoc has not been closed - if it has been closed, we should not generate.
            return false
        }
        if (offset - lastKDOCValidOpen < KDOC_OPEN_MAX_MARGIN) {
            // caret is inside the kdoc. do not generate again
            return false
        }
        return true
    }
}

