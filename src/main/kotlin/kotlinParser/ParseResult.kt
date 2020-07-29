package kotlinParser

import com.intellij.psi.PsiElement

class ParseResult(private val mKDOCElement: PsiElement?,
                  private val mParameters: List<String>,
                  private val mExceptions: List<String>,
                  private val mHasReturnValue: Boolean) {

    fun getKDOCElement(): PsiElement? {
        return mKDOCElement
    }

    fun getParameters(): List<String> {
        return mParameters
    }

    fun getExceptions(): List<String> {
        return mExceptions
    }

    fun hasReturnValue(): Boolean {
        return mHasReturnValue
    }
}