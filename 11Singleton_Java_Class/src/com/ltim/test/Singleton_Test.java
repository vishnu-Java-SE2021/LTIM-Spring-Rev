package com.ltim.test;

import com.ltim.beans.Student;

public class Singleton_Test {

	public static void main(String[] args) {
		
		Student st = Student.getStudent(1, "Airtel", "Hyd");
		Student st1 = Student.getStudent(2, "Uha", "BNG");
		
		System.out.println(st);
		System.out.println(st1);
		
	}
}
