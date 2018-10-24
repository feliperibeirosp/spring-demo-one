package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAndress;

    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }


    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmailAndress(String emailAndress) {
        this.emailAndress = emailAndress;
    }

    public String getEmailAndress() {
        return emailAndress;
    }

    public String getTeam() {
        return team;
    }
}
