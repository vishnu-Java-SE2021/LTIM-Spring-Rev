package com.ltim.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ltim.beans.WishMessageGenerator;

public class App {
    public static void main( String[] args ){
        
    	FileSystemResource res = new FileSystemResource("src\\main\\java\\com\\ltim\\cfgs\\ApplicationContext.xml");
    	
    	XmlBeanFactory factory = new XmlBeanFactory(res);
    	
    	WishMessageGenerator wmg = (WishMessageGenerator)factory.getBean("wmg");
    	
    	String msg = wmg.getMessage("Airtel Fibre");
    	
    	System.out.println(msg);
    }
}
