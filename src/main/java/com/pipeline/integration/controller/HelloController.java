package com.pipeline.integration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Pipeline Integration Works";
    }
}
