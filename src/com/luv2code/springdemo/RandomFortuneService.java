package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create a Array of strings
	private String[] data = { 
			"You are lucky",
			"Not good day",
			"Good Day"
	};
	
	
	//create a random number
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
