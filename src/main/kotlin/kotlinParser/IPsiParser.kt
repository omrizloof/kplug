package kotlinParser

interface IPsiParser {

    /**
     * checks if a KDOC should be generated.
     * @return true if a KDOC should be generated, false otherwise.
     */
    fun shouldGenerateKDOC(): Boolean

    /**
     * parses the PSI file according to the current caret location
     * @return a ParseResult holding the parsed KDOC element, a list of arguments,
     *         a list of exceptions, and if the declaration has a return value.
     *         If parsing failed, the ParseResult will hold a null KDOC element, empty lists and false as the return value.
     */
    fun parse(): ParseResult
}