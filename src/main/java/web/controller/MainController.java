package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {
    @GetMapping(value = "/")
    public String addUsers(){
        return "index";
    }

}
