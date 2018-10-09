package com.eurofins.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eurofins.dao.InMemoryEmployeeDAOImpl;
import com.eurofins.service.EmployeeService;
import com.eurofins.service.EmployeeServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(new InMemoryEmployeeDAOImpl());
	}

}
