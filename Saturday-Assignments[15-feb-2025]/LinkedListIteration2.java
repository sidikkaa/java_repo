package com.celcom.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListIteration2 {

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
		System.out.println("Enter position: ");
		int position=sc.nextInt();
		 System.out.println();
		 if(position>n)
		 {
			 System.out.println("Invalid Position");
		 }
		 
        for(int i=position;i<list.size();i++)
        {
        	System.out.print(list.get(i)+" ");
        }
	}

}
