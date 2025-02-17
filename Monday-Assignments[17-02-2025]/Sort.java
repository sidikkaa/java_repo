package com.celcom.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//way-1
		Arrays.sort(arr);
		System.out.println("After Sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//way-2
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println("\n After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
