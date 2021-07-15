package com.example.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theFootballCoach = context.getBean("footballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theFootballCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theFootballCoach.getDailyFortune());
        context.close();

    }
}
