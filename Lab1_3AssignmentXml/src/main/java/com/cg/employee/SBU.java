package com.cg.employee;

import java.util.List;

public class SBU {
	private String sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;

	public SBU() {

	}

	/**
	 * @return the empList
	 */
	public List<Employee> getEmpList() {
		return empList;
	}

	/**
	 * @param empList the empList to set
	 */
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	/**
	 * @param sbuCode
	 * @param sbuName
	 * @param sbuHead
	 * @param empList
	 */
	public SBU(String sbuCode, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}

	public String getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public void getBusineesUnitDetails() {
		System.out.println("SBU Details");
		System.out.println("----------------------");
		System.out.println(
				"SBU [sbuCode=" + getSbuCode() + ", sbuhead=" + getSbuHead() + ", sbuName=" + getSbuName() + "]]");
		System.out.println("Employee details:---------------");		
		List<Employee> employees = getEmpList();
		for (Employee employee : employees) {
			System.out.print("[Employee [Employee Id : " + employee.getEmployeeId() + " Employee Name : "
					+ employee.getEmployeeName() + " Employee salary :" + employee.getSalary() + "] ");
	            
		}
	}
}