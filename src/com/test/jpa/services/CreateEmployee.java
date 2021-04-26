package com.test.jpa.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.jpa.employee.EmployeeEntity;

public class CreateEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		EmployeeEntity employee = new EmployeeEntity();
		employee.setEmployeeNumber(1057);
		employee.setEmail("abcdef@gmai.com");
		employee.setFirstName("AHHHHH");
		employee.setLastName("OOOP");
		employee.setOfficecode(1);
		employee.setExtension("86753");
		employee.setJobTitle("Janitor");

		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}
	
	public EmployeeEntity create(EmployeeEntity employee) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
		return employee;
	}
}
