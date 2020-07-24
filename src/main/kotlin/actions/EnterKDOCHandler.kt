package actions

import com.intellij.codeInsight.CodeInsightSettings
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegateAdapter
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiFile
import kotlinParser.KDocPsiParser

class EnterKDOCHandler : EnterHandlerDelegateAdapter() {

    override fun postProcessEnter(file: PsiFile, editor: Editor, dataContext: DataContext): EnterHandlerDelegate.Result {
        if (!CodeInsightSettings.getInstance().SMART_INDENT_ON_ENTER) {
            return EnterHandlerDelegate.Result.Continue
        }
        val currentKtFile = file as PsiFile
        val documentManager = PsiDocumentManager.getInstance(currentKtFile.project)
        documentManager.commitAllDocuments()
        val document = editor.document
        val caretOffset = editor.caretModel.offset
        val psiParser = KDocPsiParser(file, document, caretOffset)
        if (!psiParser.parse()) {
            return EnterHandlerDelegate.Result.Continue
        }
        return super.postProcessEnter(file, editor, dataContext)
    }

//    override fun preprocessEnter(
//        file: PsiFile,
//        editor: Editor,
//        caretOffset: Ref<Int>,
//        caretAdvance: Ref<Int>,
//        dataContext: DataContext,
//        originalHandler: EditorActionHandler?
//    ): EnterHandlerDelegate.Result {
//        if (!CodeInsightSettings.getInstance().SMART_INDENT_ON_ENTER) {
//            return EnterHandlerDelegate.Result.Continue
//        }
//        if (file !is KtFile) {
//            return EnterHandlerDelegate.Result.Continue
//        }
//        val document = editor.document
//        val psiParser = PsiParser(file, document, caretOffset.get())
//        if (!psiParser.shouldGenerateKDOC()) {
//            return EnterHandlerDelegate.Result.Continue
//        }
//        val elementAtCaret = file.findElementAt(caretOffset.get())
//        val p = elementAtCaret!!.parent
//        val kdoc = PsiTreeUtil.getParentOfType(elementAtCaret, KDoc::class.java)
//        if (kdoc == null) {
////            mLog.debug("cannot find parent of type KDOC")
//            return EnterHandlerDelegate.Result.Continue
//        }
//        val kdocSection = kdoc.getChildOfType<KDocSection>()
//        if (kdocSection == null) {
////            mLog.debug("cannot find kdoc")
//            return EnterHandlerDelegate.Result.Continue
//        }
//        if (kdocSection.text.trim() != "*") {
////            mLog.debug("cannot find kdoc")
//            return EnterHandlerDelegate.Result.Continue
//        }
//        mLog.debug("GOT HERE")
//        return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler)
//    }
}