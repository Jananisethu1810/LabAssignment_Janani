/**
 * author - Janani S
 * Desc   - To throw an exception if salary of an employee is below than 3000
 */

package com.cg.eis.exception;

/**
 * This is my Exception class, I have named it EmployeeException
 */
public class EmployeeException extends Exception {
	/**
	 * Call constructor of parent Exception
	 * 
	 * @param str
	 */
	public EmployeeException(String str) {
		super(str);
	}
}
