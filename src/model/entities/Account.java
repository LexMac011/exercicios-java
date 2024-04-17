package model.entities;

import model.exceptions.WithDrawException;

public class Account{
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}


	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	public void deposit(Double amount) {
		balance += amount;
	}
	public void withdraw(Double amount) {
		if (balance == 0 || amount > balance) {
			throw new WithDrawException("Not enough balance");
		}
		if (getWithDrawLimit() < amount) {
			throw new WithDrawException("The amount exceeds withdraw limit");
		}
		balance -= amount;
		System.out.println("New Balance: " + String.format("%.2f",getBalance()));
	}
	
}
