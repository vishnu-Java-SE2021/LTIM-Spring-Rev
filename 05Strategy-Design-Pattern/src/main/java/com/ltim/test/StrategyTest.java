package com.ltim.test;

import com.ltim.beans.BlueDart;
import com.ltim.beans.Courier;
import com.ltim.beans.Flipkart;

public class StrategyTest {
    public static void main( String[] args ){

    	Flipkart fpk = new Flipkart();
    	
		Courier courier = new BlueDart();
		
		fpk.setCourier(courier);
		
		String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,600});
		
		System.out.println(result);
    	
    }
}
