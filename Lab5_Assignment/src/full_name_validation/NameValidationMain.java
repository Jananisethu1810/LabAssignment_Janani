/**
 * author - Janani S
 * Desc   - To validate the full name of an employee
 * Create and throw a user defined exception if firstName and lastName is blank.
 */
package full_name_validation;

import java.util.Scanner;

public class NameValidationMain {
	public static String validateName(String first, String last) {
		String result = "";
		/**
		 * Try block contains the statement which may throw exception
		 */
		try {
			if (first.length() == 0 || last.length() == 0) {
				// Throwing the custom exception using throw
				throw new NameException("The first name or last name should not be blank");
			} else {
				result = first + " " + last;
			}
		}
		/**
		 * Catch block handles the exception thrown by the try block
		 */
		catch (NameException exception) {
			System.out.println("Caught the exception");
			System.out.println(exception.getMessage());
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name and last name of a person");
		String firstName = sc.next(); // Getting first name from user
		String lastName = sc.next(); // Getting last name from user

		/**
		 * Function calling is done by passing firstName and lastName as an argument It
		 * is used to validate whether the given strings are null
		 */
		String result = validateName(firstName, lastName);
		System.out.println(result);
		sc.close();
	}

}
