package com.celcom.day3;
class Employee{
	private int eid;
	private String ename;
	private int salary;
	public Employee()
	{
	}
	public Employee(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		System.out.print(eid);
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class BeanClass {
	public static void main(String args[])
	{
		Employee obj=new Employee();
		obj.setEid(67);
		obj.getEid();
	}

