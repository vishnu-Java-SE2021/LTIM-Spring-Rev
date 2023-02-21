package com.ltim.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ltim.controller.EmployeeController;
import com.ltim.vo.EmployeeVO;

public class App {
    public static void main( String[] args ){
        
    	//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ltim/cfgs/ApplicationContext.xml");
    
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/ltim/cfgs/ApplicationContext.xml");
    	
    	EmployeeController ctr = factory.getBean("cont",EmployeeController.class);
    	
    	EmployeeVO empVo = new EmployeeVO();
    	
    	try(Scanner sc = new Scanner(System.in)){

    		System.out.print("Enter emp id :: ");
    		int empId = sc.nextInt(); sc.nextLine();
    		
    		System.out.print("Enter emp name :: ");
    		String ename = sc.nextLine();
    		
    		System.out.print("Enter emp add :: ");
    		String empAdd = sc.nextLine();
    		
    		System.out.print("Enter emp ph :: ");
    		String empPh = sc.nextLine();
    		
    		System.out.print("Enter emp basic salary :: ");
    		double empSal = sc.nextDouble();
    		
    		empVo.setEid(empId);
    		empVo.setEname(ename);
    		empVo.setEadd(empAdd);
    		empVo.setEph(empPh);
    		empVo.setEsal(empSal);
    		
    		String result = ctr.addEmployee(empVo);
    		
    		System.out.println(result);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}
