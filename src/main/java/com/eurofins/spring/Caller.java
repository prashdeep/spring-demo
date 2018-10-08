package com.eurofins.spring;

public class Caller {

	private GreetingService greetingService;
	private String name;

	public Caller() {}
	/*public Caller(GreetingService greetingService) {
		System.out.println("Inside the constructor of Caller");
		this.greetingService = greetingService;
		
	}*/

	public void invokeGreet(String message) {
		greetingService.greet(message, "Pradeep");
	}
	
	public void myCustomInit() {
		System.out.println("Came inside the custom initializer method");
	}
	
	public void myCustomDestroy() {
		System.out.println("Came inside the custom destroy function..");
	}
}
