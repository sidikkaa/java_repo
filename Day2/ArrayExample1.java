package com.celcom.day2;

public class ArrayExample1 {
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50};
		int sum=0;
		System.out.println("Array lenght: "+arr.length);
		System.out.print("The Elements are:\n");
		for(int index=0;index<arr.length;index++)
		{
			System.out.println(arr[index]);
			sum+=arr[index];
		}
		
		System.out.print("The Sum of Element is: "+ sum);
		System.out.print("\nEnhanced for loop\n");
		for(int value:arr)
		{
			System.out.println(value);
		}
	}

}
