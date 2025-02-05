package com.celcom.day2;
class Employee
{
	int eid;
	String ename;
	double esalary;
	//constructor
	Employee(int eid,String ename,double esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	void display()
	{
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esalary);
		
	}
}
public class ClassObjectExample1 {
	public static void main(String args[])
	{
		Employee sidikkaa=new Employee(101,"sidikkaa",34500);
		sidikkaa.display();
		Employee viji=new Employee(102,"viji",64572);
		viji.display();
	}
}
