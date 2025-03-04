package com.springDemo.demo.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    //define a private field for the dependency
    private Coach myCoach;
    //define a constructor for dependency injection
    @Autowired
    public  Controller(Coach theCoach){
        myCoach =theCoach;
    }
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }




}
