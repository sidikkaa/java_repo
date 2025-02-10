package com.celcom.Assignment2;

public class Employee {
	String name;
	String title;
	long salary;
	

	public Employee(String name, String title, long salary) {
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	void calculateSalary(int percentageIncrease)
	{
		System.out.println("The previous Salary is: "+salary);
		long increasedSalary=(percentageIncrease/10)*salary;
		System.out.println("The Salry increased after certain months is: "+increasedSalary);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("sidikkaa","TraineeSoftware",15000);
		employee.calculateSalary(30);
		

	}

}
