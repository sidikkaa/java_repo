package com.celcom.day7;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Name of thread is: "+t);
		System.out.println("Name: "+t.getName());
		System.out.println("Pririty: "+t.getPriority());

	}

}
