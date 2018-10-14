package com.codespiral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codespiral.model.Customer;
import com.codespiral.services.CustomerService;

@RestController
public class CustomerController { 
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		
		return customerService.findAllCustomer();
	} 
}
