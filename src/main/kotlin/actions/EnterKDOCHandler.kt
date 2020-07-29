package actions

import com.intellij.codeInsight.CodeInsightSettings
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegateAdapter
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.vfs.ReadonlyStatusHandler
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import documentationGenerator.DocumentationGenerator
import kotlinParser.KDocPsiParser
import org.jetbrains.kotlin.idea.kdoc.KDocElementFactory

class EnterKDOCHandler : EnterHandlerDelegateAdapter() {

    override fun postProcessEnter(file: PsiFile, editor: Editor, dataContext: DataContext): EnterHandlerDelegate.Result {
        if (!CodeInsightSettings.getInstance().SMART_INDENT_ON_ENTER) {
            return EnterHandlerDelegate.Result.Continue
        }
        val virtualFile = file.virtualFile
        if (ReadonlyStatusHandler.getInstance(file.project).ensureFilesWritable(listOf(virtualFile)).readonlyFiles.contains(virtualFile)) {
            return EnterHandlerDelegate.Result.Continue
        }
        val documentManager = PsiDocumentManager.getInstance(file.project)
        documentManager.commitAllDocuments()
        val document = editor.document
        val caretOffset = editor.caretModel.offset
        val psiParser = KDocPsiParser(file, document, caretOffset)
        if (!psiParser.shouldGenerateKDOC()) {
            return EnterHandlerDelegate.Result.Continue
        }
        val parseResult = psiParser.parse()
        if (parseResult.getKDOCElement() == null) {
            // a valid KDOC element was not found
            return EnterHandlerDelegate.Result.Continue
        }
        val documentation = DocumentationGenerator.generateDocumentation(
                parseResult.getParameters(),
                parseResult.getExceptions(),
                parseResult.hasReturnValue())
        val newKDoc = KDocElementFactory(file.project).createKDocFromText(documentation)
        val psiElement = newKDoc as PsiElement
        ApplicationManager.getApplication().runWriteAction {
            parseResult.getKDOCElement()!!.replace(psiElement)
            editor.caretModel.moveToOffset(caretOffset - DocumentationConstants.GENERATED_KDOC_NEEDED_CARET_OFFSET)
        }
        return super.postProcessEnter(file, editor, dataContext)
    }
}