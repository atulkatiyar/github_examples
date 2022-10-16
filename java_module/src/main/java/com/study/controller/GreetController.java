package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController {

    @GetMapping("/greeting")
    public String greet(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

}
