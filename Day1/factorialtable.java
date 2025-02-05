package com.celcom.day1;
import java.util.Scanner;
public class factorialtable {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("FACTORIAL TABLE");
		int k=1;
		while(k<=n)
		{
			int f=1;
		for(int i=1;i<=k;i++)
		{
			f=f*i;
			
		}
		System.out.println(k+" "+f);
		k++;
		}
	}
}
