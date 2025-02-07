package com.celcom.day4;

class Animal2

{
	void move() {
		System.out.print("sid");
	}
}
class cat2 extends Animal2 {
	void move() {
		System.out.print("hai");
	}
}
public class StaticOverriding {
	public static void main(String args[]) {
		Animal2 animal = new Animal2();
		animal.move();
	}
}
