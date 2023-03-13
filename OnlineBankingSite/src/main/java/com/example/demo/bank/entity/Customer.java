package com.example.demo.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_credintial")
public class Customer {

	@Id
    private String userName;
	private String emailId;
	private Long mobileNumber;
	private String password;
	private String status;
	
	
	public Customer() {
		super();
	}


	public Customer(String userName, String emailId, Long mobileNumber, String password, String status) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.status = status;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
}


