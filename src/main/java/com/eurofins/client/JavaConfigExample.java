package com.eurofins.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eurofins.config.AppConfig;
import com.eurofins.model.ContractEmployee;
import com.eurofins.model.Employee;
import com.eurofins.model.RegularEmployee;
import com.eurofins.service.EmployeeService;

public class JavaConfigExample {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService service = context.getBean(EmployeeService.class);
		Employee suresh = new ContractEmployee(24, "Suresh");
		Employee harish = new RegularEmployee(25, "Harish");
		Employee vinay = new ContractEmployee(26, "Vinay");

		// inserting all the employees
		// employeeService.insertEmployee(ramesh);
		service.insertEmployee(suresh);
		System.out.println(service.findAllEmployees().size());
		
	}

}
