package com.celcom.day3;

class Bike{
	String color;
	int price;
	String brand;
	Bike(String color,int price,String brand)
	{
		this.color=color;
		this.price=price;
		this.brand=brand;
	}
	void display()
	{
		System.out.println("The color of the bike is: "+color);
		System.out.println("The price of the bike is: "+price);
		System.out.println("The brand of the bike is: "+brand);	
	}
	void petrolflow()
	{
		System.out.println("This method is called to know about petrol flow");
	}
}
public class BikeClassObject {
	public static void main(String args[])
	{
		Bike obj=new Bike("black",10000,"Honda");
		obj.display();
		obj.petrolflow();
	}

}
