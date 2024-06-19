package com.manan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/*
 * Making Baseball Implementation as Primary to check the Primary Injection type. 
 * In case of multiple implementations, the implementation marked as primary will be considered first.
 */
@Component
@Primary
public class BaseballCoach implements Coach {
	
	public BaseballCoach()
	{
		System.out.println("In Constructor: "+getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Bat Swings against fast pitches daily.";
	}

}
