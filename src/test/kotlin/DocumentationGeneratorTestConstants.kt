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
                " * \n" +
                " */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @return \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @return \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " */\n"


    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @return \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_NO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @return \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_TWO_EXCEPTIONS=
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_WITH_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @return \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_ONE_EXCEPTION =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_TWO_EXCEPTIONS=
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_TWO_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_NO_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_ONE_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_TWO_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"

    const val EXPECTED_OUTPUT_THREE_PARAMS_NO_RETURN_THREE_EXCEPTIONS =
        "/**\n" +
                " * \n" +
                " * @param $FIRST_ARGUMENT_NAME \n" +
                " * @param $SECOND_ARGUMENT_NAME \n" +
                " * @param $THIRD_ARGUMENT_NAME \n" +
                " * @throws $FIRST_EXCEPTION_NAME \n" +
                " * @throws $SECOND_EXCEPTION_NAME \n" +
                " * @throws $THIRD_EXCEPTION_NAME \n" +
                " */\n"
}