package com.celcom.Assignment2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	String accountHolderName;
	String branchName;
	String AccountType;
	int accountNumber;
	long amount = 0; // Store individual account balance
	// constructor to initialize variables

	public Bank(String accountHolderName, String branchName, String accountType, int accountNumber) {
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.AccountType = accountType;
		this.accountNumber = accountNumber;
	}

	static class Account {
		List<Bank> accounts;

		Account() {
			accounts = new ArrayList<>();
		}

		// Method to add account
		void addAccount(Bank bank) {
			accounts.add(bank);
			System.out.println("Account Created: " + bank.accountHolderName + " Branch: " + bank.branchName + " Type: "
					+ bank.AccountType + " AccountNumber: " + bank.accountNumber);
		}
		// Method to remove account

		void removeAccount(int accountNumber) {
			// Iterate through the accounts and find if the account exists
			boolean accountFound = false;
			for (Bank bank : accounts) {
				if (bank.accountNumber == accountNumber) {
					accounts.remove(bank);
					System.out.println("Account with Account Number " + accountNumber + " has been removed.");
					accountFound = true;
					break;
				}
			}

			if (!accountFound) {
				System.out.println("Account not found with Account Number: " + accountNumber);
			}
		}

		// Method to print Account Details
		void printAccountDetails(int accountNumber) {
			for (Bank bank : accounts) {
				if (bank.accountNumber == accountNumber) {
					System.out.println("Account Details for Account Number: " + bank.accountNumber);
					System.out.println("Name: " + bank.accountHolderName);
					System.out.println("Branch: " + bank.branchName);
					System.out.println("Account Type: " + bank.AccountType);
					System.out.println("Balance: " + bank.amount);
					return;
				}
			}
			System.out.println("Account not found with Account Number: " + accountNumber);
		}

		// Method to deposit
		void deposit(int accountNumber, long money) {
			for (Bank bank : accounts) {
				if (bank.accountNumber == accountNumber) {
					bank.amount += money;
					System.out.println("Deposited Rs: " + money + " into Account Number: " + accountNumber);
					return;
				}
			}
			System.out.println("Account not found with Account Number: " + accountNumber);
		}
		// Method to Withdraw

		void withdraw(int accountNumber, long money) {
			for (Bank bank : accounts) {
				if (bank.accountNumber == accountNumber) {
					if (bank.amount >= money) {
						bank.amount -= money;
						System.out.println("Withdrawn Rs: " + money + " from Account Number: " + accountNumber);
					} else {
						System.out.println("Insufficient balance in Account Number: " + accountNumber);
					}
					return;
				}
			}
			System.out.println("Account not found with Account Number: " + accountNumber);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();

		System.out.println("DISPLAYING THE MENU");
		System.out.println(
				"1. Add Account\n2. Remove Account\n3. Print Account Details\n4. Deposit\n5. Withdraw\n6. Exit");

		while (true) {
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.print("Enter Account Holder Name: ");
				String accountHolderName = sc.next();
				System.out.print("Enter Branch Name: ");
				String branch = sc.next();
				System.out.print("Enter Account Type: ");
				String accountType = sc.next();
				System.out.print("Enter Account Number: ");
				int accountNumber = sc.nextInt();
				Bank bank = new Bank(accountHolderName, branch, accountType, accountNumber);
				acc.addAccount(bank);
				System.out.println("Account added successfully.");
				break;
			}
			case 2: {
				System.out.print("Enter Account Number to Remove: ");
				int accountNumber = sc.nextInt();
				acc.removeAccount(accountNumber);
				break;
			}
			case 3: {
				System.out.print("Enter Account Number to View Details: ");
				int accountNumber = sc.nextInt();
				acc.printAccountDetails(accountNumber);
				break;
			}
			case 4: {
				System.out.print("Enter Account Number to Deposit Into: ");
				int accountNumber = sc.nextInt();
				System.out.print("Enter Amount to Deposit: ");
				long depositAmount = sc.nextLong();
				acc.deposit(accountNumber, depositAmount);
				break;
			}
			case 5: {
				System.out.print("Enter Account Number to Withdraw From: ");
				int accountNumber = sc.nextInt();
				System.out.print("Enter Amount to Withdraw: ");
				long withdrawAmount = sc.nextLong();
				acc.withdraw(accountNumber, withdrawAmount);
				break;
			}
			case 6: {
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid Choice. Please try again.");
				break;
			}
			}
		}
	}
}
