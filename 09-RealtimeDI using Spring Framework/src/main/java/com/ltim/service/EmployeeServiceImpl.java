package com.ltim.service;

import com.ltim.bo.EmployeeBO;
import com.ltim.dao.IEmployeeDAO;
import com.ltim.dto.EmployeeDTO;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeDAO empDao;
	
	public EmployeeServiceImpl(IEmployeeDAO empDao) {
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl()");
		this.empDao = empDao;
	}
	
	@Override
	public int processEmployee(EmployeeDTO empDto) {
		
		EmployeeBO empBo = new EmployeeBO();
		
		double grossSal = empDto.getEsal()+ (empDto.getEsal()*0.4);//basic salary + 40% of basic salary
				
		double netSal = grossSal - (empDto.getEsal()*0.2); //gross salary - 20% of basic salary
		
		empBo.setEid(empDto.getEid());
		empBo.setEname(empDto.getEname());
		empBo.setEadd(empDto.getEadd());
		empBo.setEph(empDto.getEph());
		empBo.setEgsal(grossSal);
		empBo.setEnsal(netSal);
		
		int result = empDao.insertEmployee(empBo);
		
		return result;
	}

}
