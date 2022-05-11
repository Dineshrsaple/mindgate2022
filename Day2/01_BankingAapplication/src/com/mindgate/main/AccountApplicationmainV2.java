package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationmainV2 {
	public static void main(String[] args) {

		Account account = new Account(101, "Dinesh Saple", 1000);
		boolean result = account.withdraw(200);
		if (result) {
			System.out.println("Transaction Completed Successfully");
			System.out.println("Balance :: " + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println("Balance :: " + account.getBalance());
		}
		System.out.println("-".repeat(50));

		result = account.deposit(200);
		if (result) {
			System.out.println("Deposit Successfully");
			System.out.println("Balance :: " + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
			System.out.println("Balance :: " + account.getBalance());
		}

	}
}
