package com.celcom.Assignment3;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LinkedListCopy {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new LinkedList<>();
		System.out.println("Enter value: ");
		int n=sc.nextInt();
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		List<Integer> list1=new LinkedList<>(list);
		System.out.print("\nCopied List");
		System.out.println(list1);
		List<Integer> list2=new LinkedList<>();
		list2.addAll(list);
		System.out.print("\nCopied List");
		System.out.println(list2);
	}

}
