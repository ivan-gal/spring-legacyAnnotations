package com.example.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach{

    private FortuneService myFortuneService;

    @Autowired
    public TennisCoach(@Qualifier("badFortuneService") FortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }

    @PostConstruct
    public void doSomeThingAtTheStart(){
        System.out.println("starting broooooooooooom...");
    }
    @PreDestroy
    public void doSomethingAtTheEnd(){
        System.out.println("ending brrrrrrrrrrrrrrrrrr...");
    }

}
