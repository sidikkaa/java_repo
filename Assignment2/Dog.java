package com.celcom.Assignment2;

public class Dog {
	String name;
	String breed;
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setBreed(String breed)
	{
		this.breed=breed;
	}
	void display()
	{
		System.out.println("The Name of Dog is: "+name);
		System.out.println("The Breed of Dog is: "+breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog("xyz","ABC");
		dog1.display();
		dog1.setName("Charlie");
		dog1.setBreed("Labrador");
		dog1.display();
	}

}
