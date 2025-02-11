package com.celcom.day6;

public class CloningExample implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloningExample obj1=new CloningExample();
		System.out.println(obj1.hashCode());
		CloningExample obj2=(CloningExample) obj1.clone();
		System.out.println(obj2.hashCode());

	}

}
