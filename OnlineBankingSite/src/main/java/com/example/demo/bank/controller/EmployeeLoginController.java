package com.example.demo.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bank.entity.EmployeeLogin;
import com.example.demo.bank.service.EmployeeService;

@RestController
@RequestMapping( "/employee/rest")
public class EmployeeLoginController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/login")
	public ResponseEntity<EmployeeLogin> login(@RequestBody EmployeeLogin employee) {
	
		 EmployeeLogin authEmployee = employeeService.login(employee.getUsername() ,employee.getPassword());
		 return new ResponseEntity<>(authEmployee,HttpStatus.OK); 
	}

}
