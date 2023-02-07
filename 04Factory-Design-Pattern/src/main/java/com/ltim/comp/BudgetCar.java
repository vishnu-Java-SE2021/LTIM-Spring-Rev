package com.ltim.comp;

public class BudgetCar implements Car {

public String regNo;
	
	public BudgetCar(String regNo) {
		this.regNo = regNo;
	}
	
	@Override
	public String drive() {
		return "Budget Car is registered with :: "+this.regNo;
	}

}
