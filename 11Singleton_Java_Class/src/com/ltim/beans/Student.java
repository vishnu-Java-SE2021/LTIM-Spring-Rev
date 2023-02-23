package com.ltim.beans;

public class Student {

	private static Student st = null;
	
	int id;
	String name;
	String add;
	
	private Student(int id, String name, String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public static Student getStudent(int id,String name,String add) {
		
		if(st==null) {
			st = new Student(id,name,add);
			return st;
		}
		return st;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
}
