package com.example.demo.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_credential")
public class EmployeeLogin {
	

    @Id
	private Long employeeId;
	private String username;
	private String password;
	private String employeeDesig;
	
	public EmployeeLogin() {
		
	}

	public EmployeeLogin(Long employeeId, String username, String password, String employeeDesig) {
		super();
		this.employeeId = employeeId;
		this.username = username;
		this.password = password;
		this.employeeDesig = employeeDesig;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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