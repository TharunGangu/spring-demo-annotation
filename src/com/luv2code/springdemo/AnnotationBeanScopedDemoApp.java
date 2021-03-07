package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopedDemoApp {

	public static void main(String[] args) {

		//Load a spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive a bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check if they are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("/n poitning to same object: " + result);
		
		System.out.println(theCoach.getDailyFortune());
	}

}
