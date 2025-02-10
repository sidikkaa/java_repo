package com.celcom.day5;
interface VehiclePlan1
{
	
	void noOfEngine();
	
}
interface VehiclePlan2
{
	void noOfWheels();
	void brandName();
}
abstract class vehicle implements VehiclePlan1,VehiclePlan2
{
	public void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}

class Car1 extends vehicle
{
	public void noOfWheels()
	{
		System.out.println("I have 2 wheels");
	}
	public void brandName()
	{
		System.out.println("My brand name is Benz");
	}
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.noOfWheels();
		car.brandName();
		car.noOfEngine();

	}

}
