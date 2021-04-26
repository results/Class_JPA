package com.test.jpa;

import java.util.Random;


import com.test.jpa.department.DepartmentServices;

public class JPAMain {
	static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	 static String getSaltString2() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 2) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

	public static void main(String[] args) {
		DepartmentServices d = new DepartmentServices();
		for(int i = 3; i < 50; i++) {
		  //  d.createDepartment(new Department(i,getSaltString(),getSaltString2()));//created 50 departments
		}
		System.out.println("Found? "+d.findDepartment(4).toString());
		System.out.println("Did update? "+d.updateDepartment(4, "Readable"));
		System.out.println("Updated: "+d.findDepartment(4).toString());
		System.out.println("Deleted? "+d.deleteDepartment(d.findDepartment(5)));

	}

}
