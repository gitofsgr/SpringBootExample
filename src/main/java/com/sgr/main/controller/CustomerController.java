package com.sgr.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgr.main.entities.Customers;
import com.sgr.main.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;
	
	@GetMapping("/all_customers")
	public List<Customers> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
}
