package com.codespiral.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codespiral.dao.CustomerDAO;
import com.codespiral.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDao;


	public List<Customer> findAllCustomer(){
		return customerDao.findAll();
	}
	
	public CustomerDAO getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}

	
}
