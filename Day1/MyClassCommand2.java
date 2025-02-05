//Command Line Argument
package com.celcom.day1;

public class MyClassCommand2 {
	public static void main(String args[]) {
		if (args.length == 2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int sum = num1 + num2;
			System.out.print("Addition: " + sum);
		} else {
			System.out.print("Expecting 2 numbers as command line input");
		}
	}
}