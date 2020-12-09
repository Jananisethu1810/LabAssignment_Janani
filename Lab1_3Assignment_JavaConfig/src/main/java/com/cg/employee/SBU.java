package com.cg.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {
	@Value("PES-BU")
	private String sbuCode;
	@Value("Product Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;
	@Value("#{empList}")
	List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public SBU(List<Employee> empList) {
		this.empList = empList;
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

	public String getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}

	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}
	

}
