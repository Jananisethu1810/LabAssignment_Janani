/**
 * author - Janani S
 * Desc   - Creating packages and classes for updating Employee details
 */
package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.service.EmployeeSevice;

public class EmployeeMain {

	public static void main(String[] args) {
		/**
		 * Creating object for Employee and EmployeeService class
		 */
		Employee empObj = new Employee();
		Service serviceObj = new Service();
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		/**
		 * Menu for operations to perform
		 */
		while (flag > 0) {
			System.out.println("1. Give User Information");
			System.out.println("2. Get Insurance Scheme & Display the Details");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			/**
			 * Invoking methods according to the choice
			 */
			switch (choice) {

			case 1:
				System.out.println("Your choice is to get details");
				serviceObj.getEmployeeDetails(empObj);
				break;
			case 2:
				System.out.println("Your choice is to view detais");
				serviceObj.displayDetails(empObj);
				break;
			case 3:
				System.out.println("Thanks for using the Employee Service!!!");
				flag = 0;
				break;
			default:
				System.out.println("Choose from menu!!!");
			}
		}
		sc.close();

	}

}