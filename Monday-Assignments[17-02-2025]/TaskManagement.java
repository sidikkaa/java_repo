package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("1.Add a new Task");
		System.out.println("2.View all tasks");
		System.out.println("3.Mark a task as completed");
		System.out.println("4.display task along with status");
		System.out.println("5.Delete a task");
		System.out.println("6.Search for a task");
		System.out.println("7.Exit");

		while (true) {

			System.out.println("----------------Enter Choice:----------------");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the Number of Task:");
				int n = sc.nextInt();
				System.out.println("Enter the tasks: ");
				for (int i = 0; i < n; i++) {
					list.add(sc.next());
				}
				break;
			}
			case 2: {

				if (list.isEmpty()) {
					System.out.println("List is Empty");
				} else {
					System.out.println("Displaying the added task");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
				break;
			}
			case 3: {
				System.out.println("Completed Task: ");
				int flag=0;
				String completedTask = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equals(completedTask)) {
						flag=1;
						list.set(i, (list.get(i) + " completed"));
					}
				}
				if(flag==0)
				{
					System.out.println("The entered task is not valid");
					if(list.isEmpty())
					{
						System.out.println("The list is Empty");
					}
				}
				break;
			}
			case 4: {
				if (list.isEmpty()) {
					System.out.println("There is no task to display");
				} else {
					System.out.println("Displaying task along with status: ");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
				break;
			}
			case 5: {
				System.out.println("Enter the task to be deleted: ");
				String TaskToBeCompleted = sc.next();
				int flag=0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equals(TaskToBeCompleted)) {
						flag=1;
						list.remove(TaskToBeCompleted);
					}
				}
				if(flag==0)
				{
					System.out.println("The entered task is not a valid one");
					if(list.isEmpty())
					{
						System.out.println("The list is Empty");
					}
				}
				break;
			}
			case 6: {

				System.out.println("Task to be Searched: ");
				int flag=0;
				String SearchTask = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).equals(SearchTask)) {
						flag=1;
						System.out.print("Found at the index: " + i);
					}
				}
				if(flag==0)
				{
					System.out.println("The task to be searched is not valid");
					if(list.isEmpty())
					{
						System.out.println("The list is Empty");
					}
				}
				break;
			}
			case 7: {
				System.out.println("ThankYou");
				System.exit(0);
			}
			}
		}
	}

}
