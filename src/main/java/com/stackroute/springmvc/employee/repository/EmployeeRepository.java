package com.stackroute.springmvc.employee.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stackroute.springmvc.employee.model.Employee;

@Repository
public class EmployeeRepository {
	
	
	private List<Employee> employeeList;

	public EmployeeRepository() {
		this.employeeList = new ArrayList<>();
		
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
//	CRUD Method
	
	public Employee addEmployee(Employee employee) {
		this.employeeList.add(employee);
		return employee;
	}

	public void deleteEmployee(int empId) {
		this.employeeList.removeIf(employee -> employee.getId() == empId);
		
	}

	
	
	
	

}
