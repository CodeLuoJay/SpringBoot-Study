package com.luojay.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("/getThymeleaf")
    public String Welcome(){
        return "luojay";
    }
    @RequestMapping("/login")
    public String Login(){
        return "login";
    }
}
