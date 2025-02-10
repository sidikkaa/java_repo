package com.celcom.day5;
interface one
{
	
	int a=10;//by default interface variable are public,static,final
}
interface two
{
	int a=20;
}
interface three extends one,two
{
	void addition();
}
class Addition implements three
{
	public void addition()
	{
		System.out.println("Addition: "+(one.a+two.a));
	}
}
public class MultipleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		obj.addition();

	}

}
