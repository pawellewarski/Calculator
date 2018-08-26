package pl.akademiakodu.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private Calculator calculator = new Calculator();

    @GetMapping ("/")
    public String home(){
        return "home";
    }

//    @ResponseBody
    @GetMapping ("/result")
    public String result(
            @RequestParam String first_number,
            @RequestParam String second_number,
            @RequestParam String options,
            ModelMap map
    ){
        if(options.equals("add")){
            double result = calculator.add(Double.parseDouble(first_number), Double.parseDouble(second_number));
            map.put("result", result);
        }

        return "result";
    }

}
