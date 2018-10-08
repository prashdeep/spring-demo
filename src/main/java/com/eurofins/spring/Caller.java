package com.eurofins.spring;

public class Caller {

	private GreetingService greetingService;
	private String name;

	public Caller(GreetingService greetingService, String name) {
		System.out.println("Inside the constructor of Caller");
		this.greetingService = greetingService;
		this.name = name;
	}

	public void invokeGreet(String message) {
		greetingService.greet(message, name);
	}
	
	public void myCustomInit() {
		System.out.println("Came inside the custom initializer method");
	}
	
	public void myCustomDestroy() {
		System.out.println("Came inside the custom destroy function..");
	}
}
