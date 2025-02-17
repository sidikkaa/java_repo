package com.celcom.day10;

class Resource
{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data =data;
	}
}
class Consumer extends Thread
{
	Resource resource;
	Consumer(Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		synchronized(resource) {
			System.out.println("Consumer is waiting for Producer to produce a dara.....");
			try
			{
				resource.wait();
				
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("Data from server: "+resource.getData());
		}
	}
}
class Producer extends Thread
{
	Resource resource;
   Producer (Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		synchronized(resource) {
			System.out.println("Producer is Producing the data...");
			resource.setData("Hello Consumer");
			resource.notify();
		}
	}
}
public class ProducerConsumerThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Resource resource=new Resource();
		Consumer consumer=new Consumer(resource);
		consumer.start();
		Thread.sleep(2000);
		Producer producer=new Producer(resource);
		producer.start();
	}
}
