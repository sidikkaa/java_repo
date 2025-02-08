package com.celcom.Assignment2;

public class Circle {
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	void area()
	{
		double areaCalculation=3.14*radius*radius;
		System.out.println("The Area of Circle is: "+areaCalculation);
	}
	void circumference()
	{
		double circumferenceCalculation=2*3.14*radius;
		System.out.println("The Circumference of circle is: "+circumferenceCalculation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(7);
		circle.area();
		circle=new Circle(6);
		circle.circumference();
		
		
		

	}

}
