package documentationGenerator

import DocumentationConstants

abstract class DocumentationGenerator {

    companion object {

        /**
         * generates the KDOC for a function
         * @param functionArguments a list of the arguments received by the function  to document
         * @param hasReturnValue true if the function has a return value, false otherwise
         * @param thrownExceptions a list of the exceptions thrown by the function to document
         *
         * @return a string holding the documentation
         */
        fun generateDocumentation(functionArguments: List<String>, thrownExceptions: List<String>, hasReturnValue: Boolean): String {
            val stringBuilder = StringBuilder()
            stringBuilder.appendln(DocumentationConstants.KDOC_OPEN_TOKEN)
                    .appendln("\t ${DocumentationConstants.LINE_PREFIX} ")
            functionArguments.forEach {
                stringBuilder.appendln("\t ${DocumentationConstants.LINE_PREFIX} ${DocumentationConstants.KDOC_PARAM} $it ")
            }
            if (hasReturnValue) {
                stringBuilder.appendln("\t ${DocumentationConstants.LINE_PREFIX} ${DocumentationConstants.KDOC_RETURN} ")
            }
            thrownExceptions.forEach {
                stringBuilder.appendln("\t ${DocumentationConstants.LINE_PREFIX} ${DocumentationConstants.KDOC_THROWS} $it ")
            }
            stringBuilder.appendln("\t ${DocumentationConstants.KDOC_CLOSE_TOKEN}")

            return stringBuilder.toString()
        }
    }
}