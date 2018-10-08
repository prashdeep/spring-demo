package com.eurofins.spring;

public class Greeter implements GreetingService {
	
	private String salutation;
	
	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public Greeter() {
		System.out.println("Inside the constructor of Greeter");
	}
	
	public void greet(String message, String name) {
		System.out.println("Hi !! "+salutation+" "+name+" "+ message);
	}
	
	

}
