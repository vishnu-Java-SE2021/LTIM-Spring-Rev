package com.ltim.vo;

public class EmployeeVO {

	int eid;
	String ename;
	String eadd;
	String eph;
	double esal;
	
	public EmployeeVO() {
		System.out.println("EmployeeVO.EmployeeVO()");
	}
	
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
	
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
}
