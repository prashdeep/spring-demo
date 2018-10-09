package com.eurofins.dao;

import java.util.List;

import com.eurofins.model.Employee;

public interface EmployeeDAO {
	
	public void save(Employee employee);
	
	public List<Employee> listAll();
	
	public Employee findById(long empId);
	
	public void deleteEmployeeById(long empId);

}
