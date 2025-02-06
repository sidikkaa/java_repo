package com.celcom.day3;

class Vehicle{
	void noOfEngine(){
		System.out.println("I have one engine");
	}
}
class  TwoWheeler extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I have 2 wheels");
	}
}
class Cycle extends TwoWheeler
{
	void brandName()
	{
		System.out.println(("the brand name is DUKE"));
	}
	
}
class scooty extends TwoWheeler
{
	void brandName()
	{
		System.out.println("activa");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Cycle Duke=new Cycle();
	    scooty activa=new scooty();
	    activa.brandName();
		Duke.noOfEngine();
		Duke.noOfWheels();
	}
}
