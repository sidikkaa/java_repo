package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter the Value: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			int element=sc.nextInt();
			list.add(element);
		}
		System.out.println("\nAscending Order Sort");
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("\nDescending Order Sort: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		

	}

}
