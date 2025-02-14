package com.celcom.day9;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer obj1=new Integer(a);//Boxing;
		System.out.println(obj1);
		int b=obj1.intValue();//UnBoxing
		//jdk 1.5
		Integer obj2=a;//Auto-Boxing
		int c=obj2;//Auto-UnBoxing
	}

}
