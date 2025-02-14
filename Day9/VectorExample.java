package com.celcom.day9;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<>(3,2);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.add(40);
		System.out.println(vec.size());
		System.out.println(vec.capacity());//once the size is full it will increment by 2 capacity since we have specified it (3,2)
	    for(int i=0;i<vec.size();i++)
	    {
	    	System.out.println(vec.get(i));
	    }
	    for(Integer i:vec)
	    {
	    	System.out.println(i);
	    }
	    Enumeration<Integer> enu=vec.elements();
	    while(enu.hasMoreElements())
	    {
	    	System.out.println(enu.nextElement());
	    }
	
	
	}
	

}
