package com.springDemo.demo.restControlers;

import org.springframework.beans.factory.annotation.Value;
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
    //inject properties from properties file
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
//expose new endpoint for team info
    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Coach name:  " + coachName +"  Team name: "+teamName;
    }


}
