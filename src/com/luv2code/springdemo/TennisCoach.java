package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	
	//define defult construcotr just to check
	public TennisCoach() {
		System.out.println("Default constructor in Tennis class");
	}
	/*
	//setter method for dependency injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
//	//Define init method
//	@PostConstruct
//	public void doMyStatupStuff() {
//		System.out.println("/n Inside TennisCoach: doMyStartupStuff");
//	}
//	
//	//Define pre destroy method
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println("/n Inside TennisCoach: doMyCleanupStuff");
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practise your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
