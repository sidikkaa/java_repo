package com.celcom.day7;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Thread Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1=new MyThread();
		System.out.println(t1.getState());//New
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		//main method is also running and t1 is also running
		t1.start();//Starting or running my thread
		
		//thread is asynchronous
		Thread.sleep(3000);
		System.out.println("Main End");
	}

}
