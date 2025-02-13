package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		System.out.println(s1.length());//4
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.toLowerCase());//java
		System.out.println(s1.toUpperCase());//JAVA
		System.out.println(s1.concat(" world"));//java world
		System.out.println(s1.replace('a','z'));//jzvz
		System.out.println(s1.equals("java"));//true
		System.out.println(s1.equalsIgnoreCase("java"));//false
		System.out.println(s1.contains("va"));//true
		System.out.println(s1.startsWith("ja"));//true
		System.out.println(s1.endsWith("va"));//false
		String s2="Java World";
		System.out.println(s2.substring(2,7));//va wo
		System.out.println(s2.substring(2));//va world
		
	}
}
