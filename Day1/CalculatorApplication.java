package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter your Choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int a = num1 + num2;
			System.out.print(a);
			break;
		case 2:
			int b = num1 - num2;
			System.out.print(b);
			break;
		case 3:
			int c=num1*num2;
			System.out.print(c);
			break;
		case 4:
			int d=num1/num2;
			System.out.print(d);
		}
	}
}
