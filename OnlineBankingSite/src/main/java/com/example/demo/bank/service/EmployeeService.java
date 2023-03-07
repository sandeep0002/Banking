package com.example.demo.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bank.entity.EmployeeLogin;
import com.example.demo.bank.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public EmployeeLogin login(String username, String password) {
		
		EmployeeLogin employee = repo.findByUsernameAndPassword(username, password);
		return employee;
	}

}
