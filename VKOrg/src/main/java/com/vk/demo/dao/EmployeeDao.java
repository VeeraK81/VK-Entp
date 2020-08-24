package com.vk.demo.dao;

import java.util.List;


import com.vk.demo.entities.Employee;


public interface EmployeeDao {
	
	
	public List<Employee> getAllEmployee();
		
	public List<Employee> findEmployeesByBankId(Integer bId);

	public Employee updateEmployee(Employee emp);

	public Employee getEmployee(Integer eId);
	
	public List<Employee> findByEmployeeId(Integer employeeid);

	public void addEmployee(Employee empUp);

}
