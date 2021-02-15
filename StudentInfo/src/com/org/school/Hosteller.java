package com.org.school;

public class Hosteller extends Student{
	
	double hostelFee;

	public Hosteller()
	{
		
	}
	
	public Hosteller(int studentId, String name, double examFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public double payFee(int amount)
	{
		return hostelFee -= amount;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	
}
