package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String [] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);


        Coach coach2 = context.getBean("myCoach", Coach.class);

        boolean result = (coach == coach2);

        System.out.println("\nPointing to the same object " + result);

        System.out.println("\nMemory Location for coach " + coach);

        System.out.println("\nMemory Location for coach " + coach2);

        context.close();

    }
}
