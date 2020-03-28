package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	private static int tx = 5;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialBalance) {
		this.number = number;
		this.holder = holder;
		deposit(initialBalance);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + tx;
	}
	
	public String toString() {
//		return "Account "
//				+ number
//				+ ", Holder: "
//				+ holder
//				+ ", Balance: R$ "
//				+ String.format("%.2f", balance);
		return String.format("%nAccont %d, Holder: %s, Balance: R$ %.2f", number, holder, balance);
	}
	
	
}
