package com.ltim.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {

	@Autowired    //Field Level Injection
	@Qualifier("dt1")
	private Date date;

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date +"-"+date.getYear()+ ","+ date.getMonth()+"]";
	}

	public String getMessage(String user) {
		
		int hour = date.getHours();
				
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
