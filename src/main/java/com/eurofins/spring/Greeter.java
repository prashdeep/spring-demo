package com.eurofins.spring;

public class Greeter implements GreetingService {
	
	private String salutation;
	
	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	
	public void greet(String message, String name) {
		System.out.println("Hi !! "+salutation+" "+name+" "+ message);
	}
	
	

}
