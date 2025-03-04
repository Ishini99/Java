package com.springDemo.demo.restControlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/")
    public String sayHello(){
        return "hello";
    }
}
