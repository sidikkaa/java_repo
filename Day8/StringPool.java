package com.celcom.day8;
//== vs equals
public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//false
		String s3="Java";
		String s4="Java";
		System.out.println(s3.equals(s4));//true
		System.out.println(s3==s4);//true

	}

}
