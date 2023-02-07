package com.ltim.comp;

public class SportsCar implements Car {

	public String regNo;
	
	public SportsCar(String regNo) {
		this.regNo = regNo;
	}
	
	@Override
	public String drive() {
		return "Sports Car is registered with :: "+this.regNo;
	}

}
