package com.ltim.comp;

public class LuxoryCar implements Car {

	public String regNo;
	
	public LuxoryCar(String regNo) {
		this.regNo = regNo;
	}
	
	@Override
	public String drive() {
		return "Luxory Car is registered with :: "+this.regNo;
	}

}
