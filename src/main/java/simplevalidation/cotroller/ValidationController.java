package simplevalidation.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import simplevalidation.bean.FormBean;

@Controller
public class ValidationController {

    @RequestMapping("/sample")
    public String validateSample1(@Validated FormBean formBean, BindingResult result) {
        if (result.hasErrors()) {
            return "simpleValidation";
        }
        return "result";
    }

    @RequestMapping("/")
    public String welcome(@ModelAttribute FormBean formBean) {
        return "simpleValidation";
    }
}
