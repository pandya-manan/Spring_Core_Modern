package com.manan.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manan.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
	private Coach theCoach;
	
	/* Constructor Injection
	@Autowired
	public DemoController(Coach myCoach)
	{
		theCoach=myCoach;
	}
	*/
	
	/* Setter Injection 
	@Autowired
	public void setCoach(Coach myCoach)
	{
		theCoach=myCoach;
	}
	*/
	
	/* Using @Qualifier notation to specify which implementation must be autowired
	@Autowired
	public DemoController(@Qualifier("footballCoach")Coach myCoach)
	{
		theCoach=myCoach;
	}
	*/
	
	public DemoController(@Qualifier("footballCoach")Coach myCoach)
	{
		System.out.println("In Constructor: "+getClass().getSimpleName());
		theCoach=myCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout()
	{
		return theCoach.getDailyWorkout();
	}

}
