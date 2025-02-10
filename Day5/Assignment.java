package com.celcom.day5;

import java.util.Scanner;
interface Area
{
	
	void calculateArea();
}
interface perimeter
{
	void calculatePerimeter();
}
abstract class Shape implements Area,perimeter {
	int radius, length, breadth;
	float height;

	Shape(int radius) {
		this.radius = radius;
	}

	Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Shape(int length, float height) {
		this.length = length;
		this.height = height;
	}

	public void calculateArea() {

	}
	public void calculatePerimeter()
	{
		
	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		System.out.println("The area of circle is " + (3.14 * radius * radius));
	}
	public void calculatePerimeter()
	{
		System.out.println("The perimeter of circle is "+(2*3.14*radius));
	}

}

class Rectangle extends Shape {
	Rectangle(int length,int breadth) {
		super(2, 2);
	}

	public void calculateArea() {
		System.out.println("The area of Rectangle is " + (length * breadth));
	}
	public void calculatePerimeter()
	{
		System.out.println("The perimeter of Rectangle is "+(length+breadth));
	}
}

class Traingle extends Shape {
	Traingle(int length,Float height) {
		super(2, 4.5f);
	}

	public void calculateArea() {
		System.out.println("The area of Triangle is " + (0.5 * length * height));
	}
	public void calculatePerimeter() {
		System.out.println("The perimeter of Triangle is " + (length+breadth));
	}
}

public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape;
		System.out.println("1. Circle  2.Rectangle 3.Triangle ");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			shape.calculateArea();
			shape.calculatePerimeter();
		}
		if (choice == 2) {
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Breadth");
			int breadth = sc.nextInt();
			shape = new Rectangle(length,breadth);
			shape.calculateArea();
			shape.calculatePerimeter();
		}
		if (choice == 3) {
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Height");
			Float height = sc.nextFloat();
			
			shape = new Traingle(length,height);
			shape.calculateArea();
			shape.calculatePerimeter();
		}

	}

}
