package org.example.dauvannghia_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home(){
        return "home/index";
    }
}
