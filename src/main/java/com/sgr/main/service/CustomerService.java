package com.sgr.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgr.main.entities.Customers;
import com.sgr.main.repository.CustomerRepository;



@Service
public class CustomerService {

	
	@Autowired
	public CustomerRepository customerRepository;
	
	public List<Customers> getAllCustomers()
	{
		List<Customers> cust =  customerRepository.findAll();
		
		Customers c = cust.get(0);
		System.out.println("Cust Data "+cust.get(0));
		System.out.println("Cust Data "+c.getCustomerName());
		return cust;
		
	}
	
	public List<Customers> saveCustomer(Customers cust)
	{
		Customers save = customerRepository.save(cust);
		List<Customers> customers = new ArrayList<>();
		customers.add(cust);
		return customers;
	}
}
