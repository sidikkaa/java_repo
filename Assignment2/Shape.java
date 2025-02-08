package com.celcom.Assignment2;
class Shapes
{
	void getArea()
	{
		System.out.print("Rectangle area");
	}
}
class Rectangles extends Shapes
{
	void getArea()
	{
		double length=4;
		double breadth=5;
		System.out.println("Area of Rectangle is: "+(0.5*length*breadth));
	}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj=new Rectangles();
		obj.getArea();
	}

}
