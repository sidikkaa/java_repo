package com.celcom.day1;
import java.util.Scanner;
public class UserInputExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int eid = sc.nextInt();
		String ename = sc.next();
		char egender = sc.next().charAt(0);
		double esalary = sc.nextDouble();
		System.out.println("Employee id: " + eid);
		System.out.println("Employee name: " + ename);
		System.out.println("Employee salary: " + esalary);
		System.out.println("Employee gender: " + egender);
	}
}