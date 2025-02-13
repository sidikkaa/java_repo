package com.celcom.day8;
//strings are immutable objects like array
public class StringImmutable {
	public static void main(String args[])
	{
		String s1="java";
		s1=s1.concat(" World");
		System.out.println(s1);
		StringBuffer sb=new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("Java ");
		sb1.append("world");
		System.out.println(sb1);
		String s2="java";
		
	}

}
