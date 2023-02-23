package com.ltim.beans;

public class Employee {

	private int eid;
	private String ename;
	private String eadd;
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eadd=" + eadd + "]";
	}
	
	
}
