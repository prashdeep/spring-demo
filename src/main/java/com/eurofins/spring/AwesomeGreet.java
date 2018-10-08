package com.eurofins.spring;

public class AwesomeGreet implements GreetingService {
	
	private String salutation;
	

	public String getSalutation() {
		return salutation;
	}


	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}


	public void greet(String message, String name) {
		System.out.println("Hello !! "+salutation+" " +name +" "+message);
	}

}
