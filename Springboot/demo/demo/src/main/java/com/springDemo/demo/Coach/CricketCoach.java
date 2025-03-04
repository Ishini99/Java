package com.springDemo.demo.Coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "practice cricket from cricket coach";
    }
}
