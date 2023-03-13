package com.example.demo.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bank.entity.Customer;
import com.example.demo.bank.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer/rest")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerserviceimpl;
	
	

	@PostMapping("/signup")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
		
		Customer customerSaved= customerserviceimpl.addCustomer(customer);
		
		
		return new ResponseEntity<Customer>(customerSaved,HttpStatus.CREATED);

	
	}
	

}


