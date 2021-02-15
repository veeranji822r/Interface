package com.org.school;

public class Student {
	
	int studentId;
	String name;
	double examFee;
	public Student()
	{
		
	}
	public Student(int studentId, String name, double examFee) {
		
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	
}
