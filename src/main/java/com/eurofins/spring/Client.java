package com.eurofins.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml","greeters.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		Caller caller1 = appContext.getBean(Caller.class,"caller");
		//Caller caller2 = appContext.getBean(Caller.class,"caller");
		
		//System.out.println("Both caller1 and caller2 are same >> "+(caller1 == caller2));
		//caller.invokeGreet("Learning Spring 5.0..");
		((AbstractApplicationContext)appContext).registerShutdownHook();
	}

}
