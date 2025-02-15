package com.celcom.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListIteration {

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
		 System.out.println();
		//Way-1
        for(int i=0;i<list.size();i++)
        {
        	System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //Way-2
        for(Integer i:list)
        {
        	System.out.print(i+" ");
        }
        //Way-3
        Iterator<Integer> it=list.iterator();
        System.out.println();
        while(it.hasNext())
        {
        	System.out.print(it.next()+" ");
        }  
		

	}

}
