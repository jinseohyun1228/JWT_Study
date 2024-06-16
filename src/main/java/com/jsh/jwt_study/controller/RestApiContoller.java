package com.jsh.jwt_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiContoller {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
