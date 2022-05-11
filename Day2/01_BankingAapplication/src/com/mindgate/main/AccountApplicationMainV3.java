package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountnumber;
		String name;
		double balance;
		int transactionChoice;
		double amount;
		String continueChoice;

		System.out.println("Welcome to the XYZ Bank");
		System.out.println("Enter Account Number");
		accountnumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Your Initial Balance");
		balance = scanner.nextDouble();
		System.out.println("Account Open Successfully........");
		Account account = new Account(accountnumber, name, balance);
		do {
			System.out.println(" Press 1 to Withdraw");
			System.out.println(" Press 2 to Deposite");
			System.out.println(" Press 3 to Check the balace");
			System.out.println("Enter Your Choice ");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter the amount to be withdraw");
				amount = scanner.nextInt();
				boolean result = account.withdraw(amount);
				if (result) {
					System.out.println("Transaction Completed Successfully");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;

			case 2:
				System.out.println("Enter the amount to Deposit");
				amount = scanner.nextInt();
				result = account.deposit(amount);
				if (result) {
					System.out.println("Deposit Successfully");
					System.out.println("Balance :: " + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;

			case 3:
				System.out.println(account.getBalance());
				break;

			default:
				System.out.println("Invlid Choice");
				break;
			}
			System.out.println("Do you want to Continue Yes/No");
			continueChoice = scanner.next();
		} while (continueChoice.equals("Yes"));
		System.out.println("Thank You For Banking With Us.........");
	}
}
