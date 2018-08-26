package pl.akademiakodu.Calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {

    private Calculator calculator = new Calculator();

    @ResponseBody
    @PostMapping("/result")
    public String result(
            @RequestParam String first_number,
            @RequestParam String second_number,
            @RequestParam String options
    ) {
        if (options.equals("add")) {
            double result = calculator.add(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        if (options.equals("subtraction")) {
            double result = calculator.subtraction(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        if (options.equals("multiplication")) {
            double result = calculator.multiplication(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        if (options.equals("division")) {
            double result = calculator.division(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        if (options.equals("power")) {
            double result = calculator.power(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        if (options.equals("max")) {
            double result = calculator.max(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        } else if (options.equals("min")) {
            double result = calculator.min(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        return null;
    }
}

