package bank_account;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;

	/**
	 * Parameterized constructor
	 */

	public Account(long accNum, double balance, Person accHolder) {
		this.balance = balance;
		this.accHolder = accHolder;
		this.accNum = accNum;
	}

	/**
	 * Getters and setters for the account element
	 */

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	/**
	 * This method performs deposit operation
	 */

	public void deposit(double amount) {
		balance = balance + amount;

	}

	/**
	 * This method performs withdrawal operation
	 */

	public void withdraw(double amount) {
		balance = balance - amount;

	}
}
