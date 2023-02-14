package com.ltim.test;

import com.ltim.beans.Flipkart;
import com.ltim.factory.FlipkartFactory;

public class StrategyTest {
    public static void main( String[] args ){

//    	Flipkart fpk = new Flipkart();
//    	
//		Courier courier = new BlueDart();
//		
//		fpk.setCourier(courier);
    	
    	Flipkart fpk = FlipkartFactory.getFlipkartObj();
		
		String result = fpk.shopping(new String[] {"shirt","pant"}, new double[] {500,600});
		
		System.out.println(result);
    	
    }
}
