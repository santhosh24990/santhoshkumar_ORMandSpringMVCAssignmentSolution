package com.gl.crm.dao;

import java.util.List;

import com.gl.crm.model.Customer;

public interface Customerdoa {
	
	public void savecustomer(Customer customer);
	public void deletecustomer(int id);
	public Customer findbyid(int id);
	public List<Customer> listall();

}
