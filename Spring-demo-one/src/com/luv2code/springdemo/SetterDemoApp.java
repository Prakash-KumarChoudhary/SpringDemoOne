package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve the beans from the spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call method to the beans 
		System.out.println(theCoach.getDailyWorkout());
		//close the Context.
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();

	}

}