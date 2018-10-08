package com.eurofins.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Customer custA = (Customer) context.getBean("customer");
				
		System.out.println(custA.getCities());
	}

}
