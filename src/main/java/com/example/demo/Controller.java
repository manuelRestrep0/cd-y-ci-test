package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam int numA, @RequestParam int numB) {
        return Integer.toString(numA + numB);
    }
}
