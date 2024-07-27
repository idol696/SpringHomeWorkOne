package ru.prostostudia.homeworkone;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String printHello() {
        return "<h3>Добро пожаловать в приложение КАЛЬКУЛЯТОР</h3><ul><li>/calculator/plus?num1=<число 1>&num2=<число 2> - сумма</li>" +
                "<li>/calculator/minus?num1=<число 1>&num2=<число 2> - разница</li>" +
                "<li>/calculator/multiply?num1=<число 1>&num2=<число 2> - произведение</li>" +
                "<li>/calculator/divide?num1=<число 1>&num2=<число 2> - деление</li></ul>";
    }

    public String getPlus(double num1, double num2) {
        double sum = num1 + num2;
        return "<strong>Сумма:</strong>" + sum;
    }

    public String getMinus(double num1, double num2) {
        double diff = num1 - num2;
        return "<strong>Разница:</strong>" + diff;
    }

    public String getDivide(double num1, double num2) {
        double div;
        if (num2 != 0) {
            div = num1 / num2;
        } else {
            return "<font color=red>Ошибка! На ноль делить нельзя!</font>";
        }
        return "<strong>Результат деления:</strong>" + div;
    }

    public String getMultiply(double num1, double num2) {
        double prod = num1 * num2;
        return "<strong>Произведение:</strong>" + prod;
    }
}
