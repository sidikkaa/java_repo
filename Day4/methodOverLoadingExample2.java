package com.celcom.day4;

public class methodOverLoadingExample2 {

	void addition(int a,int b)
	{
		System.out.println("The sum of 2 integer number is: "+(a+b));
	}
	void addition(double a,double b)
	{
		System.out.println("The sum of 2 double number is: "+(a+b));
	}
	void addition(long a,long b)
	{
		System.out.println("The sum of 2 long number is: "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverLoadingExample2 obj=new methodOverLoadingExample2();
		obj.addition(2,3);
		obj.addition(2.3, 5.6);
		obj.addition(20L,98L);
		

	}

}
