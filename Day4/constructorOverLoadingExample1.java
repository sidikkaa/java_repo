package com.celcom.day4;

public class constructorOverLoadingExample1 {
	constructorOverLoadingExample1(int a,int b)
	{
		this(2.8,4.3);
		System.out.println("The concatenation of 2 integer is: "+a+b);
	}
	constructorOverLoadingExample1(double a,double b)
	{
		this("Hai ","all");
		System.out.println("The concatenation of 2 double value is: "+a+b);
	}
	constructorOverLoadingExample1(String a,String b)
	{
		System.out.println("The concatenation of 2 string is: "+(a+b));
	}
	public static void main(String args[])
	{
		constructorOverLoadingExample1 obj=new constructorOverLoadingExample1(10,20);
		//obj=new constructorOverLoadingExample1(2.0,3.0);
		//obj=new constructorOverLoadingExample1("hi","all");
			}

}
