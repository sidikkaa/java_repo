package com.celcom.Assignment2;
public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("The name of the Person is: "+name);
		System.out.println("The age of the Person is: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("Sidikkaa",21);
		person.display();
		
		

	}

}
