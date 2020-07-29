package kotlinParser

import com.intellij.psi.PsiElement

class ParseResult(private val mKDOCElement: PsiElement?,
                  private val mParameters: List<String>,
                  private val mExceptions: List<String>,
                  private val mHasReturnValue: Boolean) {

    public fun getKDOCElement(): PsiElement? {
        return mKDOCElement
    }

    public fun getParameters(): List<String> {
        return mParameters
    }

    public fun getExceptions(): List<String> {
        return mExceptions
    }

    public fun hasReturnValue(): Boolean {
        return mHasReturnValue
    }
}