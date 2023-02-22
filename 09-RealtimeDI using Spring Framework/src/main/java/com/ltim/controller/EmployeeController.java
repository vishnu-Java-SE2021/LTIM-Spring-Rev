package com.ltim.controller;

import com.ltim.dto.EmployeeDTO;
import com.ltim.service.IEmployeeService;
import com.ltim.vo.EmployeeVO;

public class EmployeeController {
	
	IEmployeeService empService;
	
	public EmployeeController(IEmployeeService empService){
		System.out.println("EmployeeController.EmployeeController()");
		this.empService = empService;
	}
	
	public String addEmployee(EmployeeVO empVo) {
		
		EmployeeDTO empDto = new EmployeeDTO();
		
		empDto.setEid(empVo.getEid());
		empDto.setEname(empVo.getEname());
		empDto.setEadd(empVo.getEadd());
		empDto.setEph(empVo.getEph());
		empDto.setEsal(empVo.getEsal());
		
		int res = empService.processEmployee(empDto);
		
		String result = res>0? "\nRecord is inserted succesfully" : "\nRecord is not inserted";
		
		return result;
	}
}
