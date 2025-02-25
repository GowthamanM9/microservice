package com.poc.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    public TestController() {
        super();
    }

    @GetMapping("/static-string")
    public String getStaticString(@RequestHeader(value = "X-Auth-Token", required = false) String token) {
        return "This is a static string after bc, dc and config yml changes. Token received: " + (token != null ? token : "none");
    }
}
