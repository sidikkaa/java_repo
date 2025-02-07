package com.celcom.day4;

class Vehicle
{
	void engine()
	{
		System.out.println("All Vehicle has 1 Engine");
	}
	void wheels()
	{
		System.out.println("All vehicle has a wheel");
	}
}
class wheels
{
	void wheelModel()
	{
		System.out.println("Wheel model is MRF");
	}
	void noOfWheels(String VehicleType)
	{
		if(VehicleType.equals("Two Wheeler"))
		{
			System.out.println("I have 2 wheels");
		}
		else if(VehicleType.equals("Four Wheeler"))
		{
			System.out.println("I have 4 wheels");
		}
	}
}
class Engine
{
	void engineModel()
	{
		System.out.println("Engine model is XYZ");
	}
	
}
class Car extends Vehicle//ISA relationship ie inheritance
{
	wheels wheel1=new wheels();//HASA wheel
	Engine engine=new Engine();//HAS A engine
	void engineModel()
	{
		engine.engineModel();
	}
	void wheelModel()
	{
		wheel1.wheelModel();
		
	}
	void noOfWheels()
	{
		wheel1.noOfWheels("Four Wheeler");
	}
}
public class HASARelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.engine();
		car.engineModel();
		car.noOfWheels();
		car.wheelModel();
		car.noOfWheels();
	}
}
