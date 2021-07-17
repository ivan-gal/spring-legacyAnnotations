package com.example.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    private FortuneService myFortuneService;

    public FootballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Playing football rn";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setMyFortuneService(FortuneService myFortuneService) {
        System.out.println("helooo");
        this.myFortuneService = myFortuneService;
    }

}
