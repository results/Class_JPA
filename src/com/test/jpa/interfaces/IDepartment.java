package com.test.jpa.interfaces;

import com.test.jpa.department.Department;

public interface IDepartment {
	
	Department findDepartment(int id);
	
	boolean updateDepartment(int id, String newName);//or dept
	
	boolean createDepartment(Department dept);
	
	boolean deleteDepartment(Department dept);

}
