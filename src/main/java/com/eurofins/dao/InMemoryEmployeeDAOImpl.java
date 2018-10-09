package com.eurofins.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.eurofins.model.Employee;

@Repository
public class InMemoryEmployeeDAOImpl implements EmployeeDAO {
	
	private Map<Long, Employee> employeeMap = new HashMap<>();

	public void save(Employee employee) {
		employeeMap.put(employee.getId(), employee);
		
	}

	public List<Employee> listAll() {
		List<Employee> empList = new ArrayList<>();
		employeeMap.values().forEach(employee -> empList.add(employee) );
		return empList;
	}

	public Employee findById(long empId) {
		return employeeMap.get(empId);
	}

	public void deleteEmployeeById(long empId) {
		employeeMap.remove(empId);
		
	}

}
