package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	@GetMapping("save-data")
	public void setdatainDB() {
		cs.saveCustomerData();
	}

}
