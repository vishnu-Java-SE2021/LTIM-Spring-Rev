package com.ltim.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ltim.beans.Flipkart;

public class StrategyTest {
    public static void main( String[] args ){

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ltim/cfgs/applicationContext.xml");
    	
    	Flipkart fpk = ctx.getBean("fpk", Flipkart.class);
		
		String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,600});
		
		System.out.println(result);
		
		ctx.close();
    	
    }
}
