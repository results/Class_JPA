package com;

import com.services.CustomerService;

public class CustomerMain {
	
	public static void main(String[] args) {
		CustomerService cService = new CustomerService();
		System.out.println("By name: ");
		System.out.println(cService.findCustomerByName("Atelier graphique"));
		System.out.println("By Credit: ");
		cService.findCustomerByCreditLimit(22000).forEach(System.out::println);
		System.out.println("By Country: ");
		cService.findCustomerByCountry("France").forEach(System.out::println);
		System.out.println("Update by ID: ");
		System.out.println(cService.updateCustomersById(103, 5900));
	}

}
