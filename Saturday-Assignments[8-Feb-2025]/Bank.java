package com.celcom.Assignment2;
import java.util.List;
import java.util.ArrayList;
public class Bank {
	 String accountHolderName;
	 static String branchName;
	 static String AccountType;
	 int accountNumber;
	  static long amount=0;
	
	
	

	public Bank(String accountHolderName,String branchName, String accountType, int accountNumber) {
		super();
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		AccountType = accountType;
		this.accountNumber = accountNumber;
	}
	Bank(long amount)
	{
		this.amount=amount;
	}
	static class Account
	{
		List<Bank> account;
		Account()
		{
			account=new ArrayList<>();
		}
		void addAccount(Bank bank)
		{
			account.add(bank);
			System.out.println("Title: "+bank.accountHolderName+" BranchName: "+bank.branchName+" AccountType: "+bank.AccountType+" AccountNumber: "+bank.accountNumber);
		}
		void removeAccount(long accountNumber)
		{
			account.removeIf(bank->bank.accountNumber==accountNumber);
		}
		void printAccount(String accountHolderName)
		{
			for(Bank bank:account)
			{
			   if((bank.accountHolderName).equals(accountHolderName))
			   {
				   System.out.println("Your Account Details");
				   System.out.println("Name: "+accountHolderName);
				   System.out.println("BranchName: "+branchName);
				   System.out.println("AccountType: "+AccountType);
				   
			   }
			}
		}
		void deposit(long money)
		{
			amount=amount+money;
			System.out.println("Debited amount successfully: "+money);
		}
		void withdraw(long money)
		{
			if(amount>0)
			{
				amount-=money;
				System.out.println("Credited Scucessfully of Rs: "+money);
			}
			else
			{
				System.out.println("Sorry!yoir Account Balance: "+amount);
			}
		}

	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank("sidikkaa","kodungaiyur","Saving",122345);
		Account acc=new Account();
		acc.addAccount(bank);
		System.out.println("After removing");
		acc.removeAccount(123456789L);
		acc.printAccount("sidikkaa");
		acc.deposit(10000L);
		acc.withdraw(1000L);
		
		
	

	}

}
