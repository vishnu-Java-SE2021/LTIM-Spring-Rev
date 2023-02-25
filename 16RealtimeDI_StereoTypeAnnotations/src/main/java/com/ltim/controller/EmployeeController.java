package com.ltim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ltim.beans.Employee;
import com.ltim.service.IEmployeeService;

@Component("empCon")
public class EmployeeController {
	
	@Autowired
	IEmployeeService empService;
	
	public List<Employee> fetchEmployees() {
						
		return empService.returnEmployees();
	}
}
