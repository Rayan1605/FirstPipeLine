package com.example.firstpipeline.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to Spring Boot for my first Pipeline";
    }
}
