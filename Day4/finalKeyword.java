package com.celcom.day4;
final class Animal//cannot be inherited since its final
{
	final void move()
	{
		System.out.print("A");
	}
}
class cat extends Animal
{
	final void move()//cannot overwrite the final method
	{
		
	}
}
public class finalKeyword {

	public static void main(String[] args) {
		final int a=20;//cannot be changed 
		a=10;
		

	}

}
