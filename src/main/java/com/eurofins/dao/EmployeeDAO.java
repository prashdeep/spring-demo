package com.eurofins.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eurofins.model.Employee;

@Repository
public interface EmployeeDAO {
	
	@Transactional(readOnly = false)
	public void save(Employee employee);
	
	public List<Employee> listAll();
	
	public Employee findById(long empId);
	
	public void deleteEmployeeById(long empId);

}
