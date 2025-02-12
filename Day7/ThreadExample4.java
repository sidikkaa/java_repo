package com.celcom.day7;

class TwoTable extends Thread
{
	public synchronized void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" * 2 = "+(i*2));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class FiveTable implements Runnable
{
	public synchronized void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.err.println(i+" * 5 = "+(i*5));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TwoTable two=new TwoTable();
		Thread five=new Thread(new FiveTable());
		
		two.start();
		System.out.println("Main1");
		two.join();//suspending the main thread until the completion of invoking thread
		System.out.println("Main");
		five.start();
		

	}

}
