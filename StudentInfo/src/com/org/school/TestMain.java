package com.org.school;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id: ");
		int sid = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter the examfee");
		double fee = sc.nextDouble();
		DayScholar ds = new DayScholar(sid,name,fee);
		System.out.println(ds.payFee(200));
		System.out.println(ds.toString());
		sc.close();
		
	}

}
