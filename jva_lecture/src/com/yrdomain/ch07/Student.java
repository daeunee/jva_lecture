package com.yrdomain.ch07;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); 
		this.studentNo = studentNo;
	}
}