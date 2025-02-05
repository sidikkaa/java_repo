package com.celcom.day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 1;
		for (int index = 1; index <= n; index++) {
			f = f * index;
		}
		System.out.print(f);

	}

}
