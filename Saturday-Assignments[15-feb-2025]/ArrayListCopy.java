package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListCopy {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter value: ");
		int n=sc.nextInt();
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		List<Integer> list1=new ArrayList<>(list);
		System.out.print("\nCopied List");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list1.get(i)+" ");
		}
		List<Integer> list2=new ArrayList<>();
		list2.addAll(list);
		System.out.print("\nCopied List");
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+" ");
		}
		
	}

}
