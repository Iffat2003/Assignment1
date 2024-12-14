package com.iffat.assignment.employee;

public class Developer extends Employee {
	private String pro_lang;
	
	public Developer(String name,int employeeId,double salary,String pro_lang) {
		super(name,employeeId,salary);
		this.pro_lang=pro_lang;
	}
	public String getpro_lang() {
		return pro_lang;
	}
	public void setpro_lang(String pro_lang) {
		this.pro_lang=pro_lang;
	}

	}


