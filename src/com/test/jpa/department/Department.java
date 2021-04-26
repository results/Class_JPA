package com.test.jpa.department;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	public Department(int departmentID, String departmentName, String departmentState) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentState = departmentState;
	}
	
	public Department() {
		super();
	}
	
	@Id
	private int departmentID;
	private String departmentName;
	private String departmentState;
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentState() {
		return departmentState;
	}
	public void setDepartmentState(String departmentState) {
		this.departmentState = departmentState;
	}
	
	@Override
	public String toString() {
		return "ID: "+getDepartmentID()+" - Name: "+getDepartmentName()+" - State: "+getDepartmentState();
	}

}
