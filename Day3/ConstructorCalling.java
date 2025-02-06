package com.celcom.day3;

public class ConstructorCalling {
	
	ConstructorCalling()
	{
		this("sidikkaa");
		System.out.print("sidikkaa");
	}
	ConstructorCalling(String name)
	{
		this(10);
		System.out.print("this is ");
	}
	ConstructorCalling(int a)
	{
		System.out.print("Hey ");
	}
	public static void main(String args[])
	{
		ConstructorCalling obj=new ConstructorCalling();
	}

}
