package com.raisoni.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raisoni.dao.EmployeeDao;
import com.raisoni.model.Employee;
import com.raisoni.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empDao;

	@Override
	public Employee getEmployee() {
		Employee employee = empDao.getEmployee();
		return employee;
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee = empDao.getAllEmployee();
		return employee;
		
	}
	
	@Override
	public void addEmployee(Employee emp)
	{
	  empDao.addEmployee(emp);
	}
		
}
