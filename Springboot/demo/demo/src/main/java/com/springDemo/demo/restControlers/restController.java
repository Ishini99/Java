package com.springDemo.demo.restControlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/test")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/test2")
    public String sayHello2(){
        return "hello test2";
    }
}
