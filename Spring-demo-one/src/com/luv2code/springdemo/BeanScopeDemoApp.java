package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
	Coach theCoach = context.getBean("myCoach",Coach.class);
	
	Coach alphaCoach= context.getBean("myCoach",Coach.class);
	
	//Check if they are the same or not
	
	boolean result = (theCoach==alphaCoach);
	System.out.println(result);
	System.out.println("Memory Location of the object:theCoach  "+theCoach);
	System.out.println("Memory Location of the object:alphacoach  "+alphaCoach);
	
	context.close();
	
	
	
	}

}
