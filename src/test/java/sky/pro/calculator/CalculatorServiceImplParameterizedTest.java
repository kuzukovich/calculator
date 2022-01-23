package sky.pro.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sky.pro.calculator.CalculatorServiceImplTestConstants.*;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class CalculatorServiceImplParameterizedTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @BeforeEach
    public void unit() {
        this.out = new CalculatorServiceImpl();
    }

    @SuppressWarnings("unused")
    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(NUMBER1, NUMBER2, RESULT_PLUS),
                Arguments.of(NUMBER1, NUMBER3, RESULT_PLUS_V2),
                Arguments.of(NUMBER2, NUMBER3, RESULT_PLUS_V3),
                Arguments.of(NUMBER1, NUMBER_ZERO, RESULT_PLUS_WITH_ZERO)
        );
    }

    @SuppressWarnings("unused")
    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(NUMBER2, NUMBER1, RESULT_MINUS),
                Arguments.of(NUMBER3, NUMBER1, RESULT_MINUS_V2),
                Arguments.of(NUMBER3, NUMBER2, RESULT_MINUS_V3),
                Arguments.of(NUMBER1, NUMBER_ZERO, RESULT_MINUS_WITH_ZERO)
        );
    }

    @SuppressWarnings("unused")
    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(NUMBER1, NUMBER2, RESULT_MULTIPLY),
                Arguments.of(NUMBER1, NUMBER3, RESULT_MULTIPLY_V2),
                Arguments.of(NUMBER3, NUMBER2, RESULT_MULTIPLY_V3),
                Arguments.of(NUMBER1, NUMBER_ZERO, RESULT_MULTIPLY_WITH_ZERO)
        );
    }

    @SuppressWarnings("unused")
    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(NUMBER2, NUMBER1, RESULT_DIVIDE),
                Arguments.of(NUMBER4, NUMBER1, RESULT_DIVIDE_V2),
                Arguments.of(NUMBER4, NUMBER2, RESULT_DIVIDE_V3),
                Arguments.of(NUMBER_ZERO, NUMBER1, RESULT_DIVIDE_WITH_ZERO)
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plusCorrectResultParams(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minusCorrectResultParams(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiplyCorrectResultParams(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divideCorrectResultParams(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, out.divide(num1, num2));
    }

}
