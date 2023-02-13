package com.ltim.beans;

public class Flipkart {

	//HAS-A property
	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}

	public  String shopping(String items[],double price[]) {
			
			double total = 0;
			
			for(int i=0;i<price.length;i++) {
				total+=price[i];
			}
			
			String status = courier.deliver(1234);
			
			return status+" bill amount :: "+total;
	}
}
