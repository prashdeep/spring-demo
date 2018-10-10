package com.eurofins.dao;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.eurofins.model.Employee;

public class HibernateDAOImpl implements EmployeeDAO{
	
	private HibernateTemplate hibernateTemplate;

	public HibernateDAOImpl(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Employee employee) {
		this.hibernateTemplate.save(employee);
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(long empId) {
		// TODO Auto-generated method stub
		
	}

}
