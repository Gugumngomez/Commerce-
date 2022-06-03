package com.codacum.springboothelloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello there world user";
    }
}
