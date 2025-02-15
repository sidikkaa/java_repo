package com.celcom.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDisplayElement{

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
		
        for(int i=0;i<list.size();i++)
        {
        	System.out.print("Element: "+list.get(i)+" "+"position: "+i+" ");
        }
	}

}