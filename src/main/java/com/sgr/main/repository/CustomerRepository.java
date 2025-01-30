package com.sgr.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgr.main.entities.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>
{
	

}
