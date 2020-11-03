/**
 * author - Janani S
 * Desc   - To validate the full name of an employee
 * Create and throw a user defined exception if firstName and lastName is blank.
 */

package full_name_validation;

/**
 * This is my Exception class, I have named it NameException
 */
public class NameException extends Exception {
	/**
	 * Call constructor of parent Exception
	 * 
	 * @param str
	 */
	public NameException(String str) {
		super(str);
	}

}
