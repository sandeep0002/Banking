package com.example.demo.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bank.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	//Optional<Customer> findByUsername(String userName);

}
