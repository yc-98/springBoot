package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("in Constructor" + getClass().getSimpleName());
    }
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("in doStartupStuff"+ getClass().getSimpleName());
    }
    @PreDestroy
    public void doPredestStuff(){
        System.out.println("in doPredestStuff"+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice running for 5km !!!";
    }
}
