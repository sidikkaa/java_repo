package com.celcom.Assignment2;

public class Rectangle {
	double width;
	double height;
	int side1;
	int side2;
	int side3;
	Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	Rectangle(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	void area()
	{
		double areaCalculation=(0.5*width*height);
		System.out.println("The area of Rectangle is: "+areaCalculation);
	}
	void perimeter()
	{
		System.out.println("The Perimeter of Triangle is: "+(side1+side2+side3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(23.0,5.9);
		rectangle.area();
		rectangle=new Rectangle(2,3,4);
		rectangle.perimeter();
		
	}

}
