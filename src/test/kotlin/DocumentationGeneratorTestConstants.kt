package documentationGenerator

object DocumentationGeneratorTestConstants {
    const val FIRST_ARGUMENT_NAME = "firstArgument"
    const val SECOND_ARGUMENT_NAME = "secondArgument"
    const val THIRD_ARGUMENT_NAME = "thirdArgument"

    const val FIRST_EXCEPTION_NAME = "firstException"
    const val SECOND_EXCEPTION_NAME = "secondException"
    const val THIRD_EXCEPTION_NAME = "thirdException"


    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @return \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t */\n"


    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS=
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @return \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_TWO_EXCEPTIONS=
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                "\t * \n" +
                "\t * @param $FIRST_ARGUMENT_NAME \n" +
                "\t * @param $SECOND_ARGUMENT_NAME \n" +
                "\t * @param $THIRD_ARGUMENT_NAME \n" +
                "\t * @throws $FIRST_EXCEPTION_NAME \n" +
                "\t * @throws $SECOND_EXCEPTION_NAME \n" +
                "\t * @throws $THIRD_EXCEPTION_NAME \n" +
                "\t */\n"
}