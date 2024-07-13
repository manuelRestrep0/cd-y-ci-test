package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ResultRepository resultRepository;

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam int numA, @RequestParam int numB) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(Integer.toString(numA + numB));
        resultRepository.save(resultEntity);
        return Integer.toString(numA + numB);
    }
}
