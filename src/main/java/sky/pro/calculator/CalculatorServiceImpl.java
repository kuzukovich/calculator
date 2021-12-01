package sky.pro.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        String str = num1 + "+" + num2 + "=" + result;
        return str;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        String str = num1 + "-" + num2 + "=" + result;
        return str;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        String str = num1 + "*" + num2 + "=" + result;
        return str;
    }

    public String divide(int num1, int num2) {
        if (num2 != 0) {
            int result = num1 / num2;
            String str = num1 + "/" + num2 + "=" + result;
            return str;
        } else return "<b>Произошла ошибка</b> ";
    }
}
