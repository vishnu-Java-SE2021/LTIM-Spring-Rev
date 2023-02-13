package com.ltim.beans;

public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
			return "Your order is delivered with BlueDart and Order id :: "+oid;
	}

}
