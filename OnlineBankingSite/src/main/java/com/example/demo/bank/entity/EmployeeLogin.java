package com.example.demo.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_credentials")
public class EmployeeLogin {
	
	private String employeeName;
	private Long employeeId;
	private String password;
	private String employeeDesig;
	
	public EmployeeLogin() {
		
	}

	public EmployeeLogin(String employeeName, Long employeeId, String password, String employeeDesig) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.password = password;
		this.employeeDesig = employeeDesig;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeDesig() {
		return employeeDesig;
	}

	public void setEmployeeDesig(String employeeDesig) {
		this.employeeDesig = employeeDesig;
	}
	
	

}
