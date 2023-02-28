package com.ltim.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cust")
@PropertySource("com/ltim/common/customer.properties")
public class Customer {
	
	@Value("${cust.id}")
	int id;
	
	@Value("${cust.name}")
	String name;
	
	@Value("${cust.add}")
	String add;
	
	@Value("${cust.ph}")
	String ph;
	
	@Value("${cust.email}")
	String email;
	
	@Override
	public String toString() {
		return "Customer [id="+id+" , name=" + name + ", add=" + add + ", ph=" + ph + ", email=" + email + "]";
	}	

	
}
