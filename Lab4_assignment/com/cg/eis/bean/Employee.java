/**
 * author - Janani S
 * Desc   - Creating packages and classes for updating Employee details
 */
package com.cg.eis.bean;

public class Employee {
	private long id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;

	/*
	 * Getters and Setters for employee attributes
	 */
	public Employee() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
}
