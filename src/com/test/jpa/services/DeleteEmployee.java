package com.test.jpa.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.jpa.employee.EmployeeEntity;

public class DeleteEmployee {
	
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		EmployeeEntity employee = entitymanager.find(EmployeeEntity.class, 1056);
		entitymanager.remove(employee);
		entitymanager.getTransaction().commit();

		//entitymanager.close();
		//emfactory.close();
	}

}
