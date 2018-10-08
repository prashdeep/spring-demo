package com.eurofins.spring.bean;

import java.util.Set;

public class Customer 
{
	String message;
	private Set<String> cities;
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Set<String> getCities() {
		return cities;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
}