package com.celcom.day4;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int nextNumber = (i + 1);
			if ((i * nextNumber) == num) {
				System.out.print("The given number is a Pronic number");
				return;
			}

		}
		System.out.print("The given number is not a pronic number");

	}

}
