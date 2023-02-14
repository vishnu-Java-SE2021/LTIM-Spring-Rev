package com.ltim.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.ltim.beans.Courier;
import com.ltim.beans.Flipkart;

public class FlipkartFactory {

	public static Properties props;
	
	static {
		
		try {
			
			FileInputStream fis = new FileInputStream("src/main/java/com/ltim/common/info.properties");
			
			props = new Properties();
			props.load(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Flipkart getFlipkartObj(){
		
		Flipkart fpk = new Flipkart();
		
		try {
			Class c = Class.forName(props.getProperty("dependent.comp"));
		
			Constructor cons[] = c.getDeclaredConstructors();
		
			Courier courier = (Courier)cons[0].newInstance();
			
			fpk.setCourier(courier);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return fpk;
			
	}
}
