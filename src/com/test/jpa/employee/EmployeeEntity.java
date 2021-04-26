package com.test.jpa.employee;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="employees")
@NamedQueries({ @NamedQuery(name = "employees.FindFirstLast", query = "Select e.firstName, e.lastName from EmployeeEntity e"),
	@NamedQuery(name = "employees.FindFirst", query = "Select e.firstName from EmployeeEntity e"),
})
public class EmployeeEntity {

	@Id
	///@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "employeeNumber")
	int employeeNumber;
	String firstName;
	String lastName;
	String email;
	int officeCode;
	String extension;
	String jobTitle;

	public EmployeeEntity(int employeeNumber, String firstName, String lastName, String email, int officeCode) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.officeCode = officeCode;
	}
	

	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public int getOfficeCode() {
		return officeCode;
	}


	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}


	public String getExtension() {
		return extension;
	}


	public void setExtension(String extension) {
		this.extension = extension;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public EmployeeEntity(int employeeNumber, String firstName, String lastName, String email, int officeCode,
			String extension, String jobTitle, int managerId) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.officeCode = officeCode;
		this.extension = extension;
		this.jobTitle = jobTitle;
	}


	public EmployeeEntity() {
		super();
	}

	public int getOfficecode() {
		return officeCode;
	}

	public void setOfficecode(int officecode) {
		this.officeCode = officecode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {

		return getEmployeeNumber()+" - "+getEmail()+" - "+getFirstName()+" - "+getLastName()+" - ";
	}

}
