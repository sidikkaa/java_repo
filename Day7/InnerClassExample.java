package com.celcom.day7;
interface MyInterface
{
	void display();
}

public class InnerClassExample implements MyInterface {
	//1.Non-Static Inner Class
	class InnerClass1
	{
		void MyMethod1()
		{
			System.out.println("Nnn-Static Inner Class");
		}
	}
	//2.Static inner class
	static class InnerClass2
	{
		void MyMethod2()
		{
			System.out.println("Static Inner Class");
		}
	}
	void MyMethod()
	{
		//3.Local inner class,acccessed with a method
		class InnerClass3
		{
			void MyMethod3()
			{
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 inner3=new InnerClass3();
		inner3.MyMethod3();
	}
	//4.Annonymous inner class
	public void display()
	{
		System.out.println("Annonymous Inner Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassExample obj1=new InnerClassExample();
		InnerClass1 inner1=obj1.new InnerClass1();
		inner1.MyMethod1();
		InnerClassExample.InnerClass2 inner2=new InnerClassExample.InnerClass2();
		inner2.MyMethod2();
		//implementation of interface without class is called annonymous inner class
		MyInterface obj3=new MyInterface()
				{
			public void display()
			{
				System.out.println("display");
			}
			
				};
				obj3.display();
				//Lambda Expression
				MyInterface obj4=()->System.out.println("Display");
				obj4.display();
				
		
	
	

	}

}
