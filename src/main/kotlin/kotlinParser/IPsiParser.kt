package kotlinParser

interface IPsiParser {

    fun shouldGenerateKDOC(): Boolean

    fun parse(): ParseResult
}