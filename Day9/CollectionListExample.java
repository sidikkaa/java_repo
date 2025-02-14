package com.celcom.day9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println(list);
        System.out.println(list.get(0));//10;
        list.add(1,15);
        System.out.println(list);
        list.set(1, 150);
        System.out.println(list);
        list.remove(new Integer(10));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println("The size of List: "+list.size());
        System.out.println(list.contains(20));
        System.out.println(list.isEmpty()); 
        //Way-1
        for(int i=0;i<list.size();i++)
        {
        	System.out.print(list.get(i)+" ");
        }
        //Way-2
        for(Integer i:list)
        {
        	System.out.print(i+" ");
        }
        //Way-3
        Iterator<Integer> it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        
        
	}
}
