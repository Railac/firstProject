package com.yedam.classes.exam;

public class Account {
	private int balance; // 객체잔고
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}else {
			this.balance= this.balance;
		}

	}

	public int getBalance() {

		return balance;
	}

}
