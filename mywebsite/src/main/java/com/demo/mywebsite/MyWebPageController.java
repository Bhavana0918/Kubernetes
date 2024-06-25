package com.demo.mywebsite;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebPageController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/contact")
    public ResponseEntity<Map<String, String>> contactForm(@RequestBody Map<String, String> formData) {
        String name = formData.get("name");
        String email = formData.get("email");
        String message = formData.get("message");

        // Here you can handle the form data, e.g., save to database or send an email

        Map<String, String> response = new HashMap<>();
        response.put("message", "Thank you, " + name + "! We have received your message.");
        return ResponseEntity.ok(response);
    }
}
