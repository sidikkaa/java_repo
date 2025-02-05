package com.celcom.day2;

public class InstanceVsStatic {
	int a=10;//instance variable
	static int b=5;//static variable;
	public static void main(String args[])
	{
		InstanceVsStatic obj1=new InstanceVsStatic();
		InstanceVsStatic obj2=new InstanceVsStatic();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		InstanceVsStatic obj3=new InstanceVsStatic();
		InstanceVsStatic obj4=new InstanceVsStatic();
		System.out.println(obj3.b);
		System.out.println(obj4.b);
		obj3.b=78;
		System.out.println(obj3.b);
		System.out.println(obj4.b);
		
	}

}
