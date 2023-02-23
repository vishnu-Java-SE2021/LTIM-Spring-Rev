package com.ltim.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ltim.beans.Employee;

public class App {
    public static void main( String[] args ){
    
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/ltim/cfgs/applicationContext.xml");
    	
    	Employee e = factory.getBean("emp",Employee.class);
    
    	Employee e1 = factory.getBean("emp",Employee.class);
    
    	System.out.println(e);
    	System.out.println(e1);
    	
    	System.out.println(e.hashCode());
    	System.out.println(e1.hashCode());
    
    }
}
