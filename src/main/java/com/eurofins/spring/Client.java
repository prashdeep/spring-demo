package com.eurofins.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		Caller caller = appContext.getBean(Caller.class,"caller");
		caller.invokeGreet("Invoked from Spring..");
		((AbstractApplicationContext)appContext).registerShutdownHook();
	}

}
