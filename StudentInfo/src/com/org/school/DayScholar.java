package com.org.school;

public class DayScholar extends Student {
	
	double transportFee;
	
	public DayScholar()
	{
		
	}
	
	public DayScholar(int studentId, String name, double examFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	
	public double payFee(int amount)
	{
		return transportFee += amount;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}


}
