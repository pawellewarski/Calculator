package pl.akademiakodu.Calculator;

import org.springframework.ui.ModelMap;
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
        if (options.equals("subtraction")){
            double result = calculator.add(Double.parseDouble(first_number), Double.parseDouble(second_number));
            return Double.toString(result);
        }
        return "result";
    }
}

