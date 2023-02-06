package com.ltim.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
		
	public WishMessageGenerator(Date date){
		this.date = date;
	}
	
	public void setDate(Date date) {
		this.date=date;
	}

	public String getMessage(String user) {
		
		int hour = date.getHours();
		
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		System.out.println(date.toString());
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
	
	
}
