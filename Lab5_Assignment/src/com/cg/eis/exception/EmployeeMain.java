/**
 * author - Janani S
 * Desc   - To throw an exception if salary of an employee is below than 3000
 */
package com.cg.eis.exception;

import java.util.*;

public class EmployeeMain {

	public static void checkEmployeeSalary(double salary) throws EmployeeException {
		if (salary < 3000.0) {
			// Throwing the custom exception using throw
			throw new EmployeeException("Employee salary should be above 3000.0");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of the employee");
		double salary = sc.nextDouble();
		/**
		 * Try block contains the statement which may throw exception
		 */
		try {
			// Function calling is done to check the of employee
			checkEmployeeSalary(salary);
		}
		/**
		 * Catch block handles the exception thrown by the try block
		 */
		catch (EmployeeException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
		sc.close();
	}

}
