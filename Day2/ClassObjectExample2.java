package com.celcom.day2;
class Fruits
{
	String color;
	int size;
	int price;
	int calories;
	Fruits(String color,int size,int price,int calories)
	{
		this.color=color;
		this.size=size;
		this.price=price;
		this.calories=calories;
	}
	void display()
	{
		System.out.println("Color of the Fruit: "+color);
		System.out.println("Size of the Fruit: "+size);
		System.out.println("Price of the fruit: "+price);
		System.out.println("Calories: "+calories);
	}
	void setPrice(int price) {
		this.price=price;
	}
}

public class ClassObjectExample2 {
	public static void main(String args[])
	{
		Fruits apple=new Fruits("red",10,50,15);
		apple.display();
		apple.setPrice(100);
		apple.display();
	}
}
