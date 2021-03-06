package com.stackroute.springmvc.employee.model;

import org.springframework.stereotype.Component;



@Component
public class Employee {
	
	private int id;
	private String name;
	private String email;
	private int contactNo;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	
	
	
	

}
