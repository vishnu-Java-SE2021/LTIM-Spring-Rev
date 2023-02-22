package com.ltim.dto;

public class EmployeeDTO {
	
	int eid;
	String ename;
	String eadd;
	String eph;
	double esal;
	
	public EmployeeDTO() {
		System.out.println("EmployeeDTO.EmployeeDTO()");
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
