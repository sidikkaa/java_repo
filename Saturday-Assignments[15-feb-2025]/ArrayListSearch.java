package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter value: ");
		int n=sc.nextInt();
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		System.out.println("Enter Element to Search: ");
		int flag=0;
	    int searchElement=sc.nextInt();
		for(int i=0;i<list.size();i++)
		{
			int element=list.get(i);
			if(element==searchElement)
			{
				flag=1;
				System.out.println("The element is found at the index: "+i+" Element: "+element);
			}
		}
		if(flag==0)
		{
			System.out.println("The Element to search is not in the list");
		}
		
		

	}

}
