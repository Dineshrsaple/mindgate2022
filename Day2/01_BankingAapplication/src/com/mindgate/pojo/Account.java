package com.mindgate.pojo;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println(" deafult constuctor of Account");
	}

	public int getAccountNumber() {
		return accountnumber;
	}

	public void setAccountNumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		System.out.println("Overloaded Constructor of Account");
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance=balance-amount;
			return true;
		}
			return false;
		}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance= balance + amount;
			return true;
		}
			return false;
			
	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
	}
}
