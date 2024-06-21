package com.demo.mywebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebPageController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
