package com.celcom.day4;
class Animal
{
	//generic definition
	void move()
	{
		System.out.println("Can not define");
	}
	void eat()
	{
		System.out.println("can not define");
	}
}
class Cat extends Animal
{
	void move()
	{
		System.out.println("Cat will move by walk");
	}
	void eat()
	{
		System.out.println("Cat will eat Rat");
	}
}
class Parrot extends Animal
{
	void move()
	{
		System.out.println("Parrot will move by Fly");
	}
	void eat()
	{
		System.out.println("Parrot will eat Fruit");
	}
}
class Fish extends Animal
{
	void move()
	{
		System.out.println("Fish will Swin");
	}
	void eat()
	{
		System.out.println("Fish will eat seed plants");
	}
}
public class methodOverridingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal=new Cat();
		animal.move();
		animal.eat();
		animal=new Parrot();
		animal.move();
		animal.eat();
		animal=new Fish();
		animal.eat();
		animal.move();

	}

}
