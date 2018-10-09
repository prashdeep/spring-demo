package com.eurofins.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eurofins.model.Employee;
import com.eurofins.service.EmployeeService;

public class EmployeeTestClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeService employeeService = context.getBean(EmployeeService.class, "employeeService");
		
		Employee ramesh = new Employee(23, "Ramesh");
		Employee suresh = new Employee(24, "Suresh");
		Employee harish = new Employee(25, "Harish");
		Employee vinay = new Employee(26, "Vinay");
		
		//inserting all the employees
		employeeService.insertEmployee(ramesh);
		employeeService.insertEmployee(suresh);
		employeeService.insertEmployee(harish);
		employeeService.insertEmployee(vinay);
		
		System.out.println(employeeService.findAllEmployees().size());
		
		System.out.println("employee with Id: 23 ::"+employeeService.findEmployeeById(23));
		System.out.println("employee with Id: 90 ::"+employeeService.findEmployeeById(90));

		
	}

}
