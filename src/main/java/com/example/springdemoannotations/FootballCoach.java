package com.example.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    private FortuneService myFortuneService;

    @Autowired
    public FootballCoach(FortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Playing football rn";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }
}
