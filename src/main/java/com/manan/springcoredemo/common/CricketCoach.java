package com.manan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for half an hour daily!";
	}
	
	public CricketCoach()
	{
		System.out.println("In Constructor: "+getClass().getSimpleName());
	}

}
