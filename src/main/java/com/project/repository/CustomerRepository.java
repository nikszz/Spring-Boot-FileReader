package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.pojo.Customers;


public interface CustomerRepository extends CrudRepository<Customers, Integer>{

}
