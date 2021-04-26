package com.test.jpa;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.omg.CosNaming._BindingIteratorImplBase;

import com.test.jpa.employee.EmployeeEntity;
import com.test.jpa.employee.EmployeeService;

import model.Orderdetail;

public class JQL {

	public static void main(String[] args) {
	    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("employees.FindFirstLast");
		List<Object[]> result = query.getResultList();
		result.forEach( (e) -> {
			System.out.println(e.toString());
		});
//		Query query = entitymanager.createQuery("Select e.firstName, e.lastName from EmployeeEntity e");
//		List<Object[]> result = query.getResultList();
//		result.forEach(System.out::println);
//		Query query = entitymanager.createQuery("Select e.firstName from EmployeeEntity e");
//		List<String> result = query.getResultList();
//		result.forEach(System.out::println);
//		Query query = entitymanager.createQuery("Select e from EmployeeEntity e where e.email like '%classicmodelcars.com'");
//		List<EmployeeEntity> result = query.getResultList();
//		result.forEach(System.out::println);
//		System.out.println("All printed.");
		
		
//		Query query = entitymanager.createQuery("Select o from Orderdetail o where o.orderNumber between 100 and 20000");
//		List<Orderdetail> result = query.getResultList();
//		result.forEach(System.out::println);
//		System.out.println("All printed.");
//		
//		Query max = entitymanager.createQuery("Select max(o.priceEach) from Orderdetail o");
//		double maxResult = (double)query.getSingleResult();
//		//result.forEach(System.out::println);
//		System.out.println(max);
	}

}
