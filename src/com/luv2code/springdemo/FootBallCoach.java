package com.luv2code.springdemo;

public class FootBallCoach implements Coach{

    private FortuneService fortuneService;

    public FootBallCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Training injures.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
