package sky.pro.calculator;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static sky.pro.calculator.CalculatorServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @BeforeEach
    public void unit() {
        this.out = new CalculatorServiceImpl();
    }

    @Test
    void plusCorrectResult() {
        int result = out.plus(NUMBER1, NUMBER2);
        assertEquals(RESULT_PLUS, result);
    }

    @Test
    void plusCorrectResultWithZero() {
        int result = out.plus(NUMBER1, NUMBER_ZERO);
        assertEquals(RESULT_PLUS_WITH_ZERO, result);
    }

    @Test
    void minusCorrectResult() {
        int result = out.minus(NUMBER2, NUMBER1);
        assertEquals(RESULT_MINUS, result);
    }

    @Test
    void minusCorrectResultWithZero() {
        int result = out.minus(NUMBER1, NUMBER_ZERO);
        assertEquals(RESULT_MINUS_WITH_ZERO, result);
    }

    @Test
    void multiplyCorrectResult() {
        int result = out.multiply(NUMBER1, NUMBER2);
        assertEquals(RESULT_MULTIPLY, result);
    }

    @Test
    void multiplyCorrectResultWithZero() {
        int result = out.multiply(NUMBER1, NUMBER_ZERO);
        assertEquals(RESULT_MULTIPLY_WITH_ZERO, result);
    }

    @Test
    void divideCorrectResult() {
        int result = out.divide(NUMBER2, NUMBER1);
        assertEquals(RESULT_DIVIDE, result);
    }

    @Test
    void divideCorrectResultWithZero() {
        int result = out.divide(NUMBER_ZERO, NUMBER1);
        assertEquals(RESULT_DIVIDE_WITH_ZERO, result);
    }

    @Test
    void divideErrorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide(NUMBER1, NUMBER_ZERO));
    }

}