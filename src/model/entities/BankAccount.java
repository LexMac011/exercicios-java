package model.entities;

public class BankAccount {
	private int ac_number;
	private String name;
	private double balance;
	
	// CONSTRUTORES 
	
	public BankAccount() {
	}
	
	public BankAccount(int ac_number, String name) {
		this.ac_number = ac_number;
		this.name = name;
	}
	public BankAccount(int ac_number, String name, double initialDeposit) {
		this.ac_number = ac_number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	// GET AND SET
	
	public int getAc_number() {
		return ac_number;
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
	
	// MÉTODOS 
	public void deposit(double value) {
		this.balance += value;
	}
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	public void update() {
		System.out.println("Updated account data:");
		System.out.printf("Account: %d, Holder:  %s, Balance $ %.2f", this.getAc_number(), this.getName(), this.getBalance());
	}
	
}
