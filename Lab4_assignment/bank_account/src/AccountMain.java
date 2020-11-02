package bank_account;

import java.util.concurrent.ThreadLocalRandom;

public class AccountMain {

	public static void main(String[] args) {

		/**
		 * Declaring objects for Person class with values
		 */

		Person personSmithObj = new Person("smith", 22);
		Person personKathyObj = new Person("kathy", 24);

		/**
		 * Declaring objects for Account class with values
		 */

		Account accSmithObj = new Account(ThreadLocalRandom.current().nextLong(), 2000.0, personSmithObj);
		Account accKathyObj = new Account(ThreadLocalRandom.current().nextLong(), 3000.0, personKathyObj);

		/**
		 * Method calling for deposit and withdraw
		 */

		accSmithObj.deposit(2000);
		accKathyObj.withdraw(2000);

		/**
		 * Displaying the current balance of Smith and Kathy.
		 */

		System.out.println("The current balance of smith's bank account is " + accSmithObj.getBalance());
		System.out.println("The current balance of kathy's bank account is " + accKathyObj.getBalance());

		/**
		 * Creating savings account for Smith
		 */

		SavingsAccount savObj = new SavingsAccount(accSmithObj.getAccNum(), accSmithObj.getBalance(), personSmithObj);
		savObj.withdraw(2000.0);

		/**
		 * Creating current account for Kathy
		 */

		CurrentAccount currObj = new CurrentAccount(accKathyObj.getAccNum(), accKathyObj.getBalance(), personKathyObj);
		currObj.withdraw(2000.0);

	}
}
