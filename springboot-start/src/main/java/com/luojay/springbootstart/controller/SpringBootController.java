package com.luojay.springbootstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class SpringBootController {
    @RequestMapping("/hello")
    public String SayHello(){
        return "Hello SpringBoot!";
    }
}
