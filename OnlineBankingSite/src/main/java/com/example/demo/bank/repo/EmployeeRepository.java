package com.example.demo.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bank.entity.EmployeeLogin;

public interface EmployeeRepository extends JpaRepository<EmployeeLogin,Long> {
	
	EmployeeLogin findByUsernameAndPassword(String username, String password);

}
