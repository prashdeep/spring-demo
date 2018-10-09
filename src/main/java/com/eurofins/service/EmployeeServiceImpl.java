package com.eurofins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.eurofins.dao.EmployeeDAO;
import com.eurofins.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	@Qualifier("inMemoryEmployeeDAO")
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
