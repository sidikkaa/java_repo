package com.celcom.day6;

import java.util.Scanner;

class AgeException extends Exception {
	int age;

	AgeException(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Invalid Age for Voting";
	}
}

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age:");
		int age = new Scanner(System.in).nextInt();

		if (age > 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {
				throw new AgeException();
			} catch(AgeException e) {
				System.out.println(e);
			}
		}
	}
}
