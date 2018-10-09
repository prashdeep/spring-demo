package com.eurofins.service;

import java.util.List;

import com.eurofins.dao.EmployeeDAO;
import com.eurofins.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public void insertEmployee(Employee employee) {
		//validations 
		employeeDAO.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAO.listAll();
	}

	@Override
	public Employee findEmployeeById(long empId) {
		return employeeDAO.findById(empId);
	}

	@Override
	public void deleteEmployeeById(long empId) {
		employeeDAO.deleteEmployeeById(empId);
	}

}
