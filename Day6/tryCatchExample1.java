package com.celcom.day6;

public class tryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		try
		{
			//int a=10/0;
			//int a=Integer.parseInt("Hello");
			int arr[]=new int[-2];
			System.out.println("hai");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A");
		}
		catch(NumberFormatException e)
		{
			System.out.println("B");
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println("C");
			
		}
		catch(Exception e)
		{
			System.out.println("D");
		}
		/*
		finally
		{
			System.out.println("Byee!");
		}*/
		System.out.println("After Exception");
	}
}
