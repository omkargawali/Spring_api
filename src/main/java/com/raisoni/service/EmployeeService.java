package com.raisoni.service;

import java.util.List;

import com.raisoni.model.Employee;

public interface EmployeeService {
	
	Employee getEmployee();
	
	List<Employee> getAllEmployee();
	
	void addEmployee(Employee emp);

}
