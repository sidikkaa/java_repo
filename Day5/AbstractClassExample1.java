package com.celcom.day5;

abstract class Vehicle 
{
	void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
 abstract void noOfWheels();
	abstract void brandName();
	
}
class Car extends Vehicle
{
	void noOfWheels()
	{
		super.noOfEngine();
		System.out.println("I have 2 wheels");
	}
	void brandName()
	{
		System.out.println("My brand name is Benz");
	}
}
abstract public class AbstractClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.noOfWheels();
		car.brandName();
		car.noOfEngine();

	}

}
