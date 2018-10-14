package com.codespiral.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.codespiral.model.Customer;

@Repository
public class CustomerDAO {

	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Customer> findAll(){

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
		Root<Customer> root = criteria.from(Customer.class);
		criteria.select(root);

		return entityManager.createQuery(criteria).getResultList();
	}
		
}
