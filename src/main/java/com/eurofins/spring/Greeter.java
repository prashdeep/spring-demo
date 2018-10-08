package com.eurofins.spring;

public class Greeter implements GreetingService {
	
	public void greet(String message) {
		System.out.println("Hi !! "+message);
	}

}
