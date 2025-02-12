package com.celcom.day7;
class Resource
{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
class Reader extends Thread
{
	Resource resource;
	Reader(Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		synchronized(resource) {
			System.out.println("Reader is waiting for writer to write a dara.....");
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
class Writer extends Thread
{
	Resource resource;
    Writer (Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		synchronized(resource) {
			System.out.println("Writer is writing the data...");
			resource.setData("Hello Readrer");
			resource.notify();
		}
	}
}
public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Resource resource=new Resource();
		Reader reader=new Reader(resource);
		reader.start();
		Thread.sleep(2000);
		Writer writer=new Writer(resource);
		writer.start();

	}
}
