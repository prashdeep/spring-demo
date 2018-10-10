package com.eurofins.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.eurofins.model.Employee;

public class JdbcEmployeeDAOImpl implements EmployeeDAO {


	
	
	private JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	@Transactional(readOnly = false)
	public void save(Employee employee) {
		
		this.jdbcTemplate.execute("insert into employee (id, name) values ("+employee.getId()+" , '"+employee.getName()+"');");
	}

	@Override
	public List<Employee> listAll() {
		String sql = "SELECT * FROM employee";
		List<Employee> empList = new ArrayList<Employee>();
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {
			Employee emp = new Employee((int)row.get("id"), (String)row.get("name"));
			empList.add(emp);
		}
		 return empList;
	}

	@Override
	public Employee findById(long empId) {
		// TODO Auto-generated method stub
		List<Employee> list =  this.jdbcTemplate.queryForList("select * from employee where id= '"+empId+"');", Employee.class);
		return list.get(0);
	}

	@Override
	public void deleteEmployeeById(long empId) {
		// TODO Auto-generated method stub

	}

}
