package kotlinParser

interface IPsiParser {

    fun parse(): Boolean

    fun getArguments(): List<String>

    fun getExceptions(): List<String>

    fun hasReturnValue(): Boolean
}