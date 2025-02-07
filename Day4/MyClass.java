package com.celcom.day4;

public class MyClass {
	{
		System.out.println("Instance block");
	}
	static 
	{
		System.out.println("static block");
	}
	public String toString()
	{
		return "To String";
	}
	MyClass()
	{
		System.out.println("Constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		MyClass obj=new MyClass();
		System.out.print(obj);
		

	}

}
