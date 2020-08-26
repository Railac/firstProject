package com.yedam.classes.exam;

public class Account01 {
	private String ano;
	private String owner;
	private int balance;
	
	
	public Account01(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		
		return ano;
	}
	public String getOwner() {
		
		return owner;
	}
	public int getBalance() {
		
		return balance;
	}
	public void setAno(String ano) {
		this.ano = ano;
		
	}
	public void setBalance(int balance) {
		this.balance = balance;
		
	}

	
	
	
	
}
