package com.raisoni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raisoni.model.Employee;
import com.raisoni.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService e;
	
	@GetMapping("/employee")
	Employee getEmployee()
	{
		return e.getEmployee();
		
	}
    @GetMapping("/employee/all")
    List<Employee> getAllEmployee()
    {
    	return e.getAllEmployee();
    }
    @PostMapping("/employee")
    void addEmployee(@RequestBody Employee emp)
    {
    	e.addEmployee(emp);
    }
}
