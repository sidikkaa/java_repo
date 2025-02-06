
package com.celcom.day3;

class Vehicle1{
	String s="sidikaa";
	Vehicle1()
	{
		System.out.println("I am super class vehicle");
	}
	void noOfEngine()
	{
		System.out.println("I am super class engine");
	}
}
class  TwoWheeler1 extends Vehicle1
{
	TwoWheeler1()
	{
		super();
	}
	void noOfEngine()
	{
		super.noOfEngine();
		System.out.println("I have 2 wheel");
		System.out.println(super.s);
		
	}
}
class Cycle1 extends TwoWheeler1
{
	void brandName1()
	{
		System.out.println(("the brand name is DUKE"));
	}
	
}
class scooty1 extends TwoWheeler1
{
	void brandName1()
	{
		System.out.println("activa");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TwoWheeler1 obj=new TwoWheeler1();
	    obj.noOfEngine();
	}
}