package com.raisoni.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.raisoni.model.Employee;

@Mapper
public interface EmployeeDao {
	
	@Select("select id,name from employee limit 1")
	Employee getEmployee();
	
	@Select("select id,name from employee")
	List<Employee> getAllEmployee();
	
	@Insert ("insert into employee(id,name)values (#{id},#{name})")
	void addEmployee(Employee emp);
	

}
