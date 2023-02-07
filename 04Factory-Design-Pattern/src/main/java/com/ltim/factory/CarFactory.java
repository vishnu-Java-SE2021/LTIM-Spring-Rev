package com.ltim.factory;

import com.ltim.comp.BudgetCar;
import com.ltim.comp.Car;
import com.ltim.comp.LuxoryCar;
import com.ltim.comp.SportsCar;

public class CarFactory {
	
	public static Car getCar(String type, String regNo) {
		
		if(type.equalsIgnoreCase("sports"))
			return new SportsCar(regNo);
		else if(type.equalsIgnoreCase("luxory"))
			return new LuxoryCar(regNo);
		else if(type.equalsIgnoreCase("budget"))
			return new BudgetCar(regNo);
		else
			throw new IllegalArgumentException("Invalid type");
		
	}

}
