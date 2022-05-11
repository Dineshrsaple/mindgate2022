package com.mindgate.pojo;

public class Current extends Account {
	private double overDraftBalanace;
	int addAmount;
	double overDraftAmount;;

	public Current() {
		System.out.println("Default Constructor of Current");
	}

	public Current(int accountnumber, String name, double balance, double overDraftBalanace) {
		super(accountnumber, name, balance);
		this.overDraftBalanace = overDraftBalanace;
		overDraftAmount = overDraftBalanace;
		System.out.println("Overloaded Constructor of Current");
		System.out.println(overDraftAmount);
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && getBalance() + getOverDraftBalanace() >= amount) {
			if (getBalance() < amount) {
				amount = amount - getBalance();
				setOverDraftBalanace(getOverDraftBalanace() - amount);
				setBalance(00);
				return true;
			} else {
				setBalance(getBalance() - amount);
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (getOverDraftBalanace() < overDraftAmount && getBalance() == 0) {
				addAmount = (int) (overDraftAmount - getOverDraftBalanace());
				if (addAmount >= amount) {
					setOverDraftBalanace(getOverDraftBalanace() + amount);
				}
				if (addAmount <= amount) {
					setOverDraftBalanace(overDraftAmount);
					amount = amount - addAmount;
					setBalance(getBalance() + amount);
				}

			}
		}
		return false;
	}

	public double getOverDraftBalanace() {
		return overDraftBalanace;
	}

	public void setOverDraftBalanace(double overDraftBalanace) {
		this.overDraftBalanace = overDraftBalanace;
	}

	@Override
	public String toString() {
		return "Current [overDraftBalanace=" + overDraftBalanace + ", toString()=" + super.toString() + "]";
	}

}
