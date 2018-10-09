package com.eurofins.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eurofins.model.Employee;

@Service
public interface EmployeeService {
	
	public void insertEmployee(Employee employee);
	
	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(long empId);
	
	public void deleteEmployeeById(long empId);
}
