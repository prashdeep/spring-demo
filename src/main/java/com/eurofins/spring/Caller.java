package com.eurofins.spring;

public class Caller {
	
	private GreetingService greetingService;

	public Caller(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void invokeGreet(String message) {
		greetingService.greet(message);
	}
}
