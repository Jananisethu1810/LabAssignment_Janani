package bank_account;

public class SavingsAccount extends Account {
	private final float minimumBalance = 500; // Declaring minimumBalance variable

	/**
	 * Parameterized constructor for Savings account
	 */

	public SavingsAccount(long accNUm, double balance, Person accHolder) {
		super(accNUm, balance, accHolder);
	}

	/**
	 * Overriding withdrawal method to perform withdrawal by minimum balance
	 */

	@Override
	public void withdraw(double amount) {
		double balAmount = getBalance() - amount;
		if (balAmount >= minimumBalance) {
			setBalance(balAmount);
			System.out.println("The withdrawal amount of Smith's acount is " + amount);
			System.out.println("The current balance after withdrawal from Smith's account is " + balAmount);
		} else {
			System.out.println("Sorry!!! Withdrawal is not possible, you have reached the minimum balance!!!");
		}
	}

}
