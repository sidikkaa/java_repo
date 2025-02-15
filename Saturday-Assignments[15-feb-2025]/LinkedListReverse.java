package com.celcom.Assignment3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new LinkedList<>();
		System.out.println("Enter value: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		//way1
		System.out.println();
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		Collections.reverse(list);
		System.out.print("\n"+list);
	}

}
