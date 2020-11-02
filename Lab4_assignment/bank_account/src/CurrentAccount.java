package bank_account;

public class CurrentAccount extends Account {
	private final float overdraftLimit = 1000; // Declaring a overdraftLimit varible

	/**
	 * Parameterized constructor for Current account
	 */

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);

	}

	/**
	 * Overriding withdrawal method to perform withdrawal by overdraft limit
	 */
	@Override
	public void withdraw(double amount) {
		double balAmount;
		if (amount <= overdraftLimit + getBalance()) {
			balAmount = getBalance() + overdraftLimit - amount;
			setBalance(balAmount);
			System.out.println("The withdrawal amount of Kathy's acount is " + amount);
			System.out.println("The current balance after withdrawal from Kathy's account is " + balAmount);

		} else {
			System.out.println("Sorry!!! Withdrawal is not possible, your overdraft limit is reached!!!");
		}
	}

}
