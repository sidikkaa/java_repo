package com.celcom.day5;
interface AnimalPlan
{
	void move();
	void eat();
}
abstract class Animal
{
	//generic definition
	abstract void move();
	abstract void eat();

}
class Cat implements AnimalPlan
{
	public void move()
	{
		System.out.println("Cat will move by walk");
	}
	public void eat()
	{
		System.out.println("Cat will eat Rat");
	}
}
class Parrot extends Animal
{
	public void move()
	{
		System.out.println("Parrot will move by Fly");
	}
	public void eat()
	{
		System.out.println("Parrot will eat Fruit");
	}
}
class Fish extends Animal
{
	public void move()
	{
		System.out.println("Fish will Swin");
	}
	public void eat()
	{
		System.out.println("Fish will eat seed plants");
	}
}
public class methodOverridingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal=new Parrot();
		animal.move();
		animal.eat();
		animal=new Fish();
		animal.eat();
		animal.move();

	}

}
