package com.ltim.factory;

import com.ltim.beans.BlueDart;
import com.ltim.beans.DHL;
import com.ltim.beans.DTDC;
import com.ltim.beans.Flipkart;

public class FlipkartFactory {

	public static Flipkart getFlipkartObj(String courierName) {
		
		Flipkart fpk = new Flipkart();
		
		if(courierName.equalsIgnoreCase("dhl"))
			fpk.setCourier(new DHL());
		else if(courierName.equalsIgnoreCase("dtdc"))
			fpk.setCourier(new DTDC());
		else if(courierName.equalsIgnoreCase("bluedart"))
			fpk.setCourier(new BlueDart());
		else
			throw new IllegalArgumentException("No courier found to inject");
		
		return fpk;
			
	}
}
