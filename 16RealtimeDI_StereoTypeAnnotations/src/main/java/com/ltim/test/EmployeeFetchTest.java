package com.ltim.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ltim.beans.Employee;
import com.ltim.controller.EmployeeController;

public class EmployeeFetchTest{
    public static void main( String[] args ){
        
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ltim/cfgs/ApplicationContext.xml");
        	
    	EmployeeController ctr = ctx.getBean("empCon",EmployeeController.class);
    	
    	List<Employee> empList = ctr.fetchEmployees();
    	
    	System.out.println("Number of employees :: "+empList.size());
    	for(Employee e :  empList) {
    		System.out.println(e);
    	}
    	
    	ctx.close();
    	
    }
}
