package com.ltim.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ltim.beans.Customer;

public class ValueAnnotationTest{
    public static void main( String[] args ) {

    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ltim/cfgs/applicationContext.xml");
    	
    	Customer c = ctx.getBean("cust",Customer.class);
    
    	System.out.println(c);
    	
    	ctx.close();
    
    }
}
