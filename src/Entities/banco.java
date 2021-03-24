package Entities;

public class banco {

	private int number;
	private String holder;
	private double balance;
	
	public banco(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public banco(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;	
	}
	
	public String toString() {
		return "Account " + number + ", Holder : " + holder +
				", Balance : $ " + String.format("%.2f", balance);
	}
	
	
}
