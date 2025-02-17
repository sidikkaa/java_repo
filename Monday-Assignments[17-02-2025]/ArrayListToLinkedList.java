package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter Value: ");
		int n=sc.nextInt();
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("ArrayList: "+list);
		List<Integer> list1=new ArrayList<>(list);
		System.out.println("LinkedList: "+list1);
	}

}
