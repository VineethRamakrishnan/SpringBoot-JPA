package com.example.repository;

import org.springframework.data.repository.Repository;

import com.example.repository.Customer;


public interface CustomerRepository extends Repository<Customer, Long> {
	
	public Customer save(Customer example);

}
