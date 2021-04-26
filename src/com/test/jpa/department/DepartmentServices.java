package com.test.jpa.department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.jpa.interfaces.IDepartment;

public class DepartmentServices implements IDepartment{
	
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Class_JPA");

	@Override
	public Department findDepartment(int id) {
	      EntityManager entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();//?
	      Department dept = entitymanager.find(Department.class,id);//table, ID
		return dept;
	}

	@Override
	public boolean updateDepartment(int id, String newName) {
	      EntityManager entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();//?
	      Department dept = entitymanager.find(Department.class,id);//table, ID
			if(dept == null)
				return false;
	      dept.setDepartmentName(newName);
	      entitymanager.getTransaction().commit();;
		return true;
	}

	@Override
	public boolean createDepartment(Department dept) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	@Override
	public boolean deleteDepartment(Department dept) {
		if(dept == null)
			return false;
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Department depart = entitymanager.find(Department.class, dept.getDepartmentID());
		if(depart == null)
			return false;
		entitymanager.remove(depart);
		entitymanager.getTransaction().commit();
		return true;
	}

}
