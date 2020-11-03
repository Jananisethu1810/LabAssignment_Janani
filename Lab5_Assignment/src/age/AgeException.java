/**
 * author - Janani S
 * Desc   - Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.
 */

package age;

/**
 * This is my Exception class, I have named it AgeException
 */
public class AgeException extends Exception {
	/**
	 * Call constructor of parent Exception
	 * 
	 * @param str
	 */
	public AgeException(String str) {
		super(str);
	}

}
