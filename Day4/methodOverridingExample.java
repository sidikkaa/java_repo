package com.celcom.day4;

class SuperClass {
	void myMethod() {
		System.out.println("I am from SuperClass");
	}

}

class SubClass extends SuperClass {
	void myMethod() {
		System.out.println("I am from SubClass");
	}

}

public class methodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj=new SubClass();
		obj.myMethod();
		SuperClass obj1=new SubClass();//DMD object is created for subclass so subclass will be called
		obj1.myMethod();

	}

}
