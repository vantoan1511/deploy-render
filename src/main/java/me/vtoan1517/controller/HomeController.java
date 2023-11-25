package me.vtoan1517.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping({"/home"})
    public String getHomePage() {
        return "index";
    }
}
