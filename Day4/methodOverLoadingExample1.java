package com.celcom.day4;

public class methodOverLoadingExample1 {
	void myMethod(int a)
	{
		int fact=1;
		for(int i=1;i<a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial given numbers is: "+fact);
	}
	void myMethod(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void myMethod(String name)
	{
		System.out.println("This is methodOverloading example "+name);
	}
    
	public static void main(String args[])
	{
		methodOverLoadingExample1 obj=new methodOverLoadingExample1();
		obj.myMethod("Team");
		obj.myMethod(5);
		obj.myMethod(2,3);
	}

}
