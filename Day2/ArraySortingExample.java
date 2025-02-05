package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {
	public static void main(String args[])
	{
		int arr[]= {2,4,5,1,9,3};
		Arrays.sort(arr);//ascending sort
		for(int index=0;index<6;index++)
		{
			System.out.print(arr[index]+" ");
		}
		System.out.println("\nMinimum Value: "+arr[0]);
		System.out.println("Second Minimum Value: "+arr[1]);
		System.out.println("Maximum Value: "+arr[arr.length-1]);
		System.out.println("Second Maximum Value: "+arr[arr.length-2]);
		System.out.println("Descending order: ");
		for(int index=arr.length-1;index>=0;index--)
		{
			System.out.print(arr[index]+" ");
		}
		
	}
	
	

}
