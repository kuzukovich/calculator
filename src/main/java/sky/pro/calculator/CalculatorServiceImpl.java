package sky.pro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        if (num2 != 0) {
            int result = num1 / num2;
            return result;
        } else throw new IllegalArgumentException("Dividing by zero is not allowed");
    }
}
