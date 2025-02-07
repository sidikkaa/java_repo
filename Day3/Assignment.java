package com.celcom.day3;

import java.util.Scanner;
class Shape {
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

	void calculateArea() {

	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	void calculateArea() {
		System.out.println("The area of circle is " + (3.14 * radius * radius));
	}

}

class Rectangle extends Shape {
	Rectangle(int length,int breadth) {
		super(2, 2);
	}

	void calculateArea() {
		System.out.println("The area of Rectangle is " + (length * breadth));
	}
}

class Traingle extends Shape {
	Traingle(int length,Float height) {
		super(2, 4.5f);
	}

	void calculateArea() {
		System.out.println("The area of Triangle is " + (0.5 * length * height));
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
		}
		if (choice == 2) {
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Breadth");
			int breadth = sc.nextInt();
			shape = new Rectangle(length,breadth);
			shape.calculateArea();
		}
		if (choice == 3) {
			System.out.println("Enter the Length");
			int length = sc.nextInt();
			System.out.println("Enter the Height");
			Float height = sc.nextFloat();
			
			shape = new Traingle(length,height);
			shape.calculateArea();
		}

	}

}
