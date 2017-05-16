package com.example.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="customer_details")
public class Customer {
	
	@Id
	private int customerId;
	@Column
	private String customerName;
	
	public int getId() {
		return customerId;
	}
	public void setId(int id) {
		customerId = id;
	}
	public String getName() {
		return customerName;
	}
	public void setName(String name) {
		customerName = name;
	}
	
	@Override
	public String toString() {
		return "Customer [Id=" + customerId + ", Name=" + customerName + "]";
	}

}
