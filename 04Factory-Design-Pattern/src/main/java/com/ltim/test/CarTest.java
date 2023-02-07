package com.ltim.test;

import com.ltim.comp.Car;
import com.ltim.factory.CarFactory;

public class CarTest {
    public static void main( String[] args ){

    	
//    	Car c = new SportsCar("TS 02 SJ 4321");
//    	System.out.println(c.drive());
//    	
//    	Car c1 = new LuxoryCar("TS 03 UG 1221");
//    	System.out.println(c1.drive());
//    	
//    	Car c2 = new SportsCar("TS 04 BP 1999");
//    	System.out.println(c2.drive());
    	
    	Car c3 = CarFactory.getCar("budget","AP 05 YS 6775");
    	System.out.println(c3.drive());
    	
    	Car c4 = CarFactory.getCar("sports","AP 05 YS 6775");
    	System.out.println(c4.drive());
    	
    	Car c5 = CarFactory.getCar("luxory","AP 05 YS 6775");
    	System.out.println(c5.drive());
    	
    }
}
