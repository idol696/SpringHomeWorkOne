package ru.prostostudia.homeworkone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {

    private final CalculatorServiceInterface calculatorService;

    public WebApplicationController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String printHello() {
        return "<h1>Сборник ДЕМО-приложений</h1><ul><li>/calculator - вызвать калькулятор</li></ul>";
    }

    @GetMapping(path = "/calculator")
    public String calculatorPrintHello() {
        return calculatorService.printHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPrintPlus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.getPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorPrintMinus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.getMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorPrintDivide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.getDivide(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorPrintMultiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.getMultiply(num1, num2);
    }

}
