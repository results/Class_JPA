package com.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.interfaces.ICustomer;
import com.test.jpa.employee.EmployeeEntity;

import model.Customer;

public class CustomerService implements ICustomer {
	
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");
	EntityManager entitymanager = emfactory.createEntityManager();

	@Override
	public Customer findCustomerByName(String name) {
		Query query = entitymanager.createQuery("Select c from Customer c where c.customerName = '"+name+"' ");//Maybe
		Customer result = (Customer) query.getSingleResult();
		if(result == null)
			System.out.println("Not found.");
		return result;
	}

	@Override
	public List<Customer> findCustomerByCreditLimit(int credit) {
		Query query = entitymanager.createQuery("Select c from Customer c where c.creditLimit > '"+credit+"' ");//Maybe
		List<Customer> result = query.getResultList();
		return result;
	}

	@Override
	public List<Customer> findCustomerByCountry(String country) {
		Query query = entitymanager.createQuery("Select c from Customer c where c.country = '"+country+"' ");//Maybe
		List<Customer> result = query.getResultList();
		return result;
	}

	@Override
	public Customer updateCustomersById(int id, int newCredit) {
		//Query query = entitymanager.createQuery("UPDATE Customer c set c.creditLimit = '"+newCredit+"' where c.customerNumber = '"+id+"' ");//Maybe
		entitymanager.getTransaction().begin();	
	    Customer customer = entitymanager.find(Customer.class,id);
	    customer.setCreditLimit(newCredit);
	    entitymanager.getTransaction().commit();
		return customer;
	}

}
