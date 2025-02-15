package com.celcom.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListReverse {

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
		System.out.println("\nThe reversed list is: ");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		Collections.reverse(list);
		System.out.println("\nThe reversed list is: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}

	}

}
