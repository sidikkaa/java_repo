package com.celcom.Assignment2;
class Vehicles
{
	void drive()
	{
		System.out.println("vehicle drive");
	}
}
class Car extends Vehicles
{
	void drive()
	{
		System.out.print("Reparing a car");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles veh=new Car();
		veh.drive();
		

	}

}
