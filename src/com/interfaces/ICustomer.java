package com.interfaces;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public interface ICustomer {
	
	Customer findCustomerByName(String names);	
	List<Customer> findCustomerByCreditLimit(int credit); // Find customer whose Credit Limit more than 100
	List<Customer> findCustomerByCountry(String country);
	Customer updateCustomersById(int id, int newCreditLimit); // update customer information by customerNumer

}
