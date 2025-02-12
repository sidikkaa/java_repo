package com.celcom.day7;
interface Calculator
{
	void calc(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=(a,b)->System.out.println("Addition: "+(a+b));
		c.calc(10, 20);
		c=(a,b)->System.out.println("Subtraction : "+(a-b));
		c.calc(20, 10);

	}

}
