package com.example.controller;

import com.example.service.CustomerServiceImpl;
import com.example.repository.Customer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	private Map<Integer,Customer> Customer = new HashMap<Integer,Customer>();
	private int key;
	
	@Autowired
	CustomerServiceImpl customer;
	
	public CustomerController() {
		key=1;
	}

	@RequestMapping(value="/getAllCustomers",method = RequestMethod.GET)
	public @ResponseBody Map<Integer,Customer> getAllCustomers(){
		
		return Customer;
	}
	
	@RequestMapping(value="/createCustomer",method = RequestMethod.POST)
	public Customer createCustomer(){
		
		return customer.saveCustomer();
		
	}

}
