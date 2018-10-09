package com.eurofins.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.eurofins.model.Employee;

public class JdbcEmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Employee employee) {
		this.jdbcTemplate.execute("insert into employee (id) values ('" + employee.getId() + "')");

	}

	@Override
	public List<Employee> listAll() {
		return this.jdbcTemplate.queryForList("select * from employee", Employee.class);
	}

	@Override
	public Employee findById(long empId) {
		// TODO Auto-generated method stub
		List<Employee> list =  this.jdbcTemplate.queryForList("select * from employee where id= '"+empId+"'", Employee.class);
		return list.get(0);
	}

	@Override
	public void deleteEmployeeById(long empId) {
		// TODO Auto-generated method stub

	}

}
