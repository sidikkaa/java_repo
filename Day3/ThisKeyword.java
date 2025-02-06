package com.celcom.day3;

public class ThisKeyword {
	String name;
	ThisKeyword(){
		this("sidikkaa");
		
		
	}
	ThisKeyword(String name)
	{
		this.name=name;
		this.greeting();
	}
	void greeting()
	{
		System.out.println("Welcome "+name);
	}
	public static void main(String args[])
	{
		ThisKeyword obj=new ThisKeyword();
	}

}
