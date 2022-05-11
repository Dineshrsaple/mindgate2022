package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {
	public static void main(String[] args) {
		Current current = new Current(100, "Dinesh", 10000, 50000);
		System.out.println(current);
		System.out.println("withdraw : 5000");
		current.withdraw(5000);// overdraft = 50000 and balance = 5000
		System.out.println(current);
		System.out.println("withdraw : 20000");
		current.withdraw(20000);// overdraft = 35000 and balance = 0
		System.out.println(current);
		System.out.println("deposite : 5000");
		current.deposit(5000);// overdraft = 40000 and balance = 0
		System.out.println(current);
		System.out.println("deposite : 15000");
		current.deposit(20000);// overdraft = 50000 and balance = 5000
		System.out.println(current);
	}

}
