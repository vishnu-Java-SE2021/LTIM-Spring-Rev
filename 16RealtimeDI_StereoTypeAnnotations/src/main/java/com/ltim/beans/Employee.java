package com.ltim.beans;

public class Employee {

	int eid;
	String ename;
	String eadd;
	String eph;
	double egsal;
	double ensal;
	
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
	public String getEph() {
		return eph;
	}
	public void setEph(String eph) {
		this.eph = eph;
	}
	public double getEgsal() {
		return egsal;
	}
	public void setEgsal(double egsal) {
		this.egsal = egsal;
	}
	public double getEnsal() {
		return ensal;
	}
	public void setEnsal(double ensal) {
		this.ensal = ensal;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eadd=" + eadd + ", eph=" + eph + ", egsal=" + egsal
				+ ", ensal=" + ensal + "]";
	}
	
}
