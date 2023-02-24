package com.ltim.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ltim.beans.WishMessageGenerator;

public class App {
    public static void main( String[] args ){

    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ltim/cfgs/ApplicationContext.xml");
    	
    	WishMessageGenerator wmg = ctx.getBean("wmg",WishMessageGenerator.class);
    	
    	System.out.println(wmg.toString());
    	
    	String msg = wmg.getMessage("Airtel Fibre");
    	
    	System.out.println("\n"+msg);
    	
    	ctx.close();
    
    }
}
