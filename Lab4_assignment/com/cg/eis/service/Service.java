/**
 * author - Janani S
 * Desc   - Creating packages and classes for updating Employee details
 */

package com.cg.eis.service;

import com.cg.eis.bean.Employee;

import java.util.*;

public class Service implements EmployeeSevice {
	/*
	 * Overriding getEmployeeDetails method to get details from user and setting the
	 * values in the employee class
	 */
	@Override
	public void getEmployeeDetails(Employee employee) {
		Scanner sc = new Scanner(System.in);
		/**
		  * Getting the required informations from the user
		 */
		System.out.println("Enter your Id");
		long id = sc.nextLong();
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your Salary");
		double salary = sc.nextDouble();
		System.out.println("Enter your Designation");
		String designation = sc.next();
		/**
		  * After getting the informations it setted to the variables of employee class by invoking setters.
		 */
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		employee.setInsuranceScheme(FindInsuranceDetails(salary));
	}

	/*
	 * FindInsuranceDetails method is overloaded to find the Insurance Scheme
	 * regarding salary
	 */
	@Override
	public String FindInsuranceDetails(double salary) {
		String scheme = null;
		if (salary <= 20000) {
			scheme = "BRONZE";
		} else if (salary <= 50000) {
			scheme = "SILVER";
		} else if (salary <= 100000) {
			scheme = "GOLD";
		} else {
			scheme = "PREMIUM";
		}
		return scheme;
	}

	/*
	 * Displaying employee details by overriding
	 */
	@Override
	public void displayDetails(Employee emp) {
		System.out.println("Id: " + emp.getId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Designation: " + emp.getDesignation());
		System.out.println("Insurance Scheme: " + emp.getInsuranceScheme());

	}

}
