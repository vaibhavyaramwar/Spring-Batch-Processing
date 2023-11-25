package com.VY.spring.batch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VY.spring.batch.Entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
