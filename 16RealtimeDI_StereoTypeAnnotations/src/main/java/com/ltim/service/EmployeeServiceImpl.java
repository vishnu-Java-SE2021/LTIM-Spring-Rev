package com.ltim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ltim.beans.Employee;
import com.ltim.dao.IEmployeeDAO;

@Component("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO empDao;
	
	@Override
	public List<Employee> returnEmployees() {
		return empDao.getEmployeesList();
	}

}
