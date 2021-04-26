package com.test.jpa.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.jpa.employee.EmployeeEntity;

public class FindingEmployee {
	
	public static void main( String[ ] args ) {
		  
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");
	      EntityManager entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();//?
	      EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,1056);//table, ID
	      System.out.println(employee.toString());

	      System.out.println("employee ID = " + employee.getEmployeeNumber());
	      System.out.println("employee FIRST NAME = " + employee.getFirstName());
	      System.out.println("employee LAST NAME = " + employee.getLastName());
	      System.out.println("employee EMAIL = " + employee.getEmail());
	      System.out.println("employee OfficeCode = " + employee.getOfficecode());
	      System.out.println("employee ext = " + employee.getExtension());
	      System.out.println("employee title = " + employee.getJobTitle());
	   }
}
