package com.celcom.day10;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter array1 elements: ");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter array2 elements: ");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr1[i]==arr2[i])
			{
				
			}
			else
			{
				System.out.println("The elements of 2 Array are different");
				return;
			}
		}
		System.out.println("The elements of 2 Array are Same ");
		
		

	}

}
