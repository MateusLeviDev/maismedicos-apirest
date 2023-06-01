package com.levi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //to indicate which url will receive
public class HelloWorld {

    @GetMapping //call method hello world
    public String helloWorld() {
        return "Hello, World!";
    }
}
