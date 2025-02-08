package com.celcom.Assignment2;
class Animals
{
	void makeSound()
	{
		System.out.println("Generic definition of animal,all animal make some sound");
	}
}
class Cat extends Animals
{
	void makeSound()
	{
//		super.makeSound();
		System.out.println("cat barks");
	}
}

public class Animal {
	public static void main(String[] args) {
		Animals animals=new Animals();
//		Cat cat=new Cat();
//		cat.makeSound();
		animals.makeSound();
		Animals myanimal=new Cat();
		myanimal.makeSound();
	}

}
