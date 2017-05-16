package com.example.service;
import com.example.repository.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository cutomerRepo;
	
	@Override
	public Customer saveCustomer() {
		Customer temp = new Customer();
		temp.setId(35);
		temp.setName("Vineeth");
		return cutomerRepo.save(temp);
	}

}
