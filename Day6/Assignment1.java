
package com.celcom.day5;

import java.util.Scanner;

class DuplicateNumberException extends Exception {

	DuplicateNumberException(String s)
	{
		super(s);
	}
}

public class Assignment1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.print("Enter the Numbers: ");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			int flag=0;
			for(int j=0;j<10;j++)
			{
					try
					{
						if((i!=j)&&(arr[i]==arr[j]))
						{
						
					throw new DuplicateNumberException("Duplicate number is found");
						}
						
					}
					catch(DuplicateNumberException e)
					{
						System.out.println(e);
					
					}
			}
		}
	}

}
