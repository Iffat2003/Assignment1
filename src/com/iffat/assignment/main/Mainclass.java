package com.iffat.assignment.main;

import com.iffat.assignment.utilities.EmployeeUtilities;
import com.iffat.assignment.employee.Manager;
import com.iffat.assignment.employee.Developer;

public class Mainclass{
	
	public static void main(String [] args) {
		
		Manager manager=new Manager("Ifra",23,55000,"Sales");
		  Developer developer=new Developer("Shaziya",22,80000,"Java");
		
		EmployeeUtilities utilities=new EmployeeUtilities();
		
		System.out.println("Manager Details:");
		utilities.printEmployeeDetials(manager);
		
		System.out.println("\nDeveloper Details:");
		utilities.printEmployeeDetials(developer);
		
		
	}

}
