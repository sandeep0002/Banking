package com.example.demo.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bank.entity.Customer;
import com.example.demo.bank.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	

	@Autowired
	CustomerRepository customerrepo;
     
    /*@Override	
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer existingCustomer = customerrepo.findByUsername(customer.getUserName()).orElse(null);
		if(existingCustomer==null)
		{
			customerrepo.save(customer);
		    return customer;
		}
		else {
			throw new CustomerAlreadyExistException();
		}
		
	}*/

	
	

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerrepo.save(customer);
		return customer;
	}

	

}
