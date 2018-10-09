package com.eurofins.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.eurofins.model.Employee;

public class JdbcEmployeeDAOImpl implements EmployeeDAO {


	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDAOImpl() {
		
		System.out.println("***********************************");
		System.out.println("Came inside the constructor of the JDBC template ....");
		System.out.println("***********************************");
	}
	
	

	public DataSource getDataSource() {
		return dataSource;
	}



	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public void save(Employee employee) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("insert into employee (id, name) values ('23' , 'kiran');");
		String sql = "SELECT * FROM employee";
		 
		List<Employee> empList = new ArrayList<Employee>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Employee emp = new Employee((int)row.get("id"), (String)row.get("name"));
			empList.add(emp);
		}
		 System.out.println(empList);


	}

	@Override
	public List<Employee> listAll() {
		return this.jdbcTemplate.queryForList("select * from employee;", Employee.class);
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
