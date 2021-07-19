package com.example.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You are going to have badFortune today";
    }
}
