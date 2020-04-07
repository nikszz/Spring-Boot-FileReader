package com.project.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pojo.Customers;
import com.project.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	String line="";
	
	public void saveCustomerData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/MyDATA.csv"));
			while( (line = br.readLine()) != null)
			{
				String[] data = line.split(",");
				Customers c = new Customers();
				c.setName(data[0]);
				c.setIssue(data[1]);
				c.setIssueID(data[2]);
				c.setAge(data[3]);
				repo.save(c);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
