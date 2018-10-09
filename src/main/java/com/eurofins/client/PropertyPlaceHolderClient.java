package com.eurofins.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eurofins.util.JdbcUtil;

public class PropertyPlaceHolderClient {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
		JdbcUtil jdbcUtil = appContext.getBean(JdbcUtil.class,"jdbc");
		System.out.println(jdbcUtil.getUsername());
		System.out.println(jdbcUtil.getPassword());
		
	}

}
