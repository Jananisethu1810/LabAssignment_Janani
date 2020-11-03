/**
 * author - Janani S
 * Desc   - Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.
 */

package age;

import java.util.*;

public class ValidateAge {
	public static void validateAgeMethod(int age) throws AgeException {
		if (age <= 15) {
			// Throwing the custom exception using throw
			throw new AgeException("Age of a person should be above 15");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		/**
		 * Try block contains the statement which may throw exception
		 */
		try {
			// Function calling is done to validate the age
			validateAgeMethod(age);
		}
		/**
		 * Catch block handles the exception thrown by the try block
		 */
		catch (AgeException exception) {
			System.out.println("Caught the exception");
			System.out.println(exception.getMessage());
		}
		sc.close();
	}

}
