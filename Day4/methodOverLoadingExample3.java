package com.celcom.day4;

public class methodOverLoadingExample3 {
	void concat(int a,int b)
	{
		System.out.println("The concatenation of 2 integer is: "+a+b);
	}
	void concat(double a,double b)
	{
		System.out.println("The concatenation of 2 double value is: "+a+b);
	}
	void concat(String a,String b)
	{
		System.out.println("The concatenation of 2 string is: "+(a+b));
	}
	public static void main(String args[])
	{
		methodOverLoadingExample3 obj=new methodOverLoadingExample3();
		obj.concat("hai ","all");
		obj.concat(10, 20);
		obj.concat(2.9, 3.8);
		
	}

}
