package com.mission6.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${message}")
    String message;

    @GetMapping("/welcome")
    public String getMessage() {
        return "HelloWorld " + message;
    }
}
