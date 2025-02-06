package com.celcom.day3;
class A
{
	A()//default constructor of super class 
	{
		super();
		System.out.println("A");
		
	}
	A(int a)
	{
		System.out.println("A 1");
	}
}
class B extends A
{
	B()
	{
		this(10);
		System.out.println("B");
	}
	B(int b)
	{
		super(10);
		System.out.println("B 1");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
	}
}
