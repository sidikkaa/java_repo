package com.celcom.Assignment2;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	private String accountHolderName;
	private String branchName;
	private String accountType;
	private int accountNumber;
	private double balance = 0.0; // Store individual account balance as decimal
	static Scanner sc = new Scanner(System.in);

	// Constructor to initialize account details
	public Bank(String accountHolderName, String branchName, String accountType, int accountNumber) {
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}

	// Static Account class to manage bank operations
	static class Account {
		HashMap<Integer, Bank> accounts = new HashMap<>(); // HashMap to store accounts

		// Add account method
		void addAccount() {
			System.out.print("Enter Account Holder Name: ");
			String accountHolderName = sc.next();

			System.out.print("Enter Branch Name: ");
			String branchName = sc.next();
			System.out.print("Enter Account Type: ");
			String accountType = sc.next();
			System.out.print("Enter Account Number: ");
			int accountNumber = sc.nextInt();
			Bank bank = new Bank(accountHolderName, branchName, accountType, accountNumber);
			if (accounts.containsKey(accountNumber)) {
				System.out.println("Account exist with this number,cant create account with this number");
			} else {
				accounts.put(accountNumber, bank);
				System.out.println("Account Created: " + bank.accountHolderName);
			}
		}

		// Remove account method
		void removeAccount() {
			System.out.print("Enter Account Number to Remove: ");
			int accountNumber = sc.nextInt();
			if (accounts.containsKey(accountNumber)) {
				accounts.remove(accountNumber);
				System.out.println("Account removed.");
			} else {
				System.out.println("Account not found.");
			}
		}

		// Print account details method
		void printAccountDetails() {
			System.out.print("Enter Account Number to View Details: ");
			int accountNumber = sc.nextInt();
			Bank bank = accounts.get(accountNumber);
			if (bank != null) {
				System.out.println("Account Details: ");
				System.out.println("Name: " + bank.accountHolderName);
				System.out.println("Branch: " + bank.branchName);
				System.out.println("Account Type: " + bank.accountType);
				System.out.println("Balance: Rs. " + bank.balance);
			} else {
				System.out.println("Account not found.");
			}
		}

		// Deposit method
		void deposit() {
			System.out.print("Enter Account Number to Deposit Into: ");
			int accountNumber = sc.nextInt();
			System.out.print("Enter Amount to Deposit: ");
			double depositAmount = sc.nextDouble();
			Bank bank = accounts.get(accountNumber);
			if (bank != null) {
				bank.balance += depositAmount;
				System.out.println("Deposited Rs. " + depositAmount);
			} else {
				System.out.println("Account not found.");
			}
		}

		// Withdraw method
		void withdraw() {
			System.out.print("Enter Account Number to Withdraw From: ");
			int accountNumber = sc.nextInt();
			System.out.print("Enter Amount to Withdraw: ");
			double withdrawAmount = sc.nextDouble();
			Bank bank = accounts.get(accountNumber);
			if (bank != null) {
				if (bank.balance >= withdrawAmount) {
					bank.balance -= withdrawAmount;
					System.out.println("Withdrew Rs. " + withdrawAmount);
				} else {
					System.out.println("Insufficient balance.");
				}
			} else {
				System.out.println("Account not found.");
			}
		}
	}

	// Main method
	public static void main(String[] args) {
		Account accountManager = new Account();
		while (true) {
			System.out.println(
					"\n1. Add Account\n2. Remove Account\n3. Print Account Details\n4. Deposit\n5. Withdraw\n6. Exit");
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				accountManager.addAccount();
				break;
			case 2:
				accountManager.removeAccount();
				break;
			case 3:
				accountManager.printAccountDetails();
				break;
			case 4:
				accountManager.deposit();
				break;
			case 5:
				accountManager.withdraw();
				break;
			case 6:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid Choice. Try again.");
			}
		}
	}
}
