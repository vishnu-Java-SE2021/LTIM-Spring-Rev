package com.ltim.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ltim.beans.WishMessageGenerator;

//@SuppressWarnings(value = ["App.class"])
public class App {
    public static void main( String[] args ){
        
//    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//    	reader.loadBeanDefinitions("com/ltim/cfgs/ApplicationContext.xml");
    	
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ltim/cfgs/ApplicationContext.xml");
    	
    	WishMessageGenerator wmg = ctx.getBean("wmg",WishMessageGenerator.class);
    	
    	System.out.println(wmg.toString());
    	
    	String msg = wmg.getMessage("Airtel Fibre");
    	
    	System.out.println("\n"+msg);
    	
    	ctx.close();
    }
}
