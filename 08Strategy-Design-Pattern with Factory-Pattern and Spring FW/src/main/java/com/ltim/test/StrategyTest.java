package com.ltim.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ltim.beans.Flipkart;

public class StrategyTest {
    public static void main( String[] args ){

		FileSystemResource res = new FileSystemResource("src/main/java/com/ltim/cfgs/applicationContext.xml");
    	
    	XmlBeanFactory factory = new XmlBeanFactory(res);
    	
    	Flipkart fpk = factory.getBean("fpk", Flipkart.class);
		
		String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,600});
		
		System.out.println(result);
    	
    }
}
