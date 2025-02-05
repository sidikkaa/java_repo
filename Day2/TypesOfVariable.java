package com.celcom.day2;


public class TypesOfVariable {
	int b=20;//instance variable;
	static int a=50;//static variable;
	public static void main(String args[])
	{
		int a=10;//local variable
		System.out.println(a);
		TypesOfVariable obj=new TypesOfVariable();
		System.out.println(obj.b);
		System.out.println(TypesOfVariable.a);
		
	}

}
