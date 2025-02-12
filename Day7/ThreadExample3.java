package com.celcom.day7;

class MyThread1 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			//System.out.println("My Thread Running...");
			System.out.println(Thread.currentThread().getName()+"Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(new MyThread1());
		//System.out.println(t1.getState());//New
		t1.setName("T1");
		//System.out.println(t1.getName());
		//System.out.println(t1.getPriority());
		//main method is also running and t1 is also running
		//t1.start();//Starting or running my thread
		
		//thread is asynchronous
		//Thread.sleep(3000);
		//System.out.println("Main End");
		//t1.suspend();
		//System.out.println(t1.getState());
		//t1.resume();
		Thread t2=new Thread(new MyThread1());
		t2.setName("T2");
		t1.start();
		t2.start();
		
		
	}

}