package com.iffat.assignment.utilities;

import com.iffat.assignment.employee.Employee;

public class EmployeeUtilities {

	public void
	printEmployeeDetials(Employee employee) {
		System.out.println("Emmployee Name:"+employee.getName());
		System.out.println("Emmployee ID:"+employee.getEmployeeId());
		System.out.println("Emmployee salary:"+employee.getSalary());
		
	}
	
	public void updateSalary(Employee employee,double newSalary) {
		employee.setSalary(newSalary);
		System.out.println("Update Salary for"+employee.getName()+":"+newSalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
