package com.celcom.day2;
import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int sum=0,evenCount=0,oddCount=0;
		System.out.println("Initial values of Array");
		for(int index=0;index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 5 values:");
		for(int index=0;index<5;index++) 
		{
			arr[index]=sc.nextInt();
		}
		System.out.print("\nThe entered elements are: \n");
		for(int index=0;index<5;index++)
		{
			System.out.println(arr[index]);
		}
		for(int index=0;index<5;index++)
		{
			if(arr[index]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			sum+=arr[index];
		}
		System.out.println("Sum of Array: "+sum);
		System.out.println("The number of even elemnets is: "+evenCount);
		System.out.println("The number of odd elemnets is: "+oddCount);
			
	}

}
