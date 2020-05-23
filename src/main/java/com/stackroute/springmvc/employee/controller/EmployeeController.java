package com.stackroute.springmvc.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.springmvc.employee.model.Employee;
import com.stackroute.springmvc.employee.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	
	@GetMapping("/")
	public String getHomePage(ModelMap modelMap) {
		System.out.println("inside Employee Controller... getHomePage()");
		modelMap.addAttribute("employeeList", this.employeeRepository.getEmployeeList());
		
		return "index";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee, ModelMap model) {
		System.out.println("Inside SaveEmployee" + employee);
		this.employeeRepository.addEmployee(employee);
		
		model.addAttribute("employeeList", this.employeeRepository.getEmployeeList());
		return "index";
	}

	/*
	 * api/v1/projects?category=dev --> request param api/v1/projects/dev --> path
	 * variable
	 */
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("empId") int empId) {
		
		this.employeeRepository.deleteEmployee(empId);
		
		/*
		 * ModelAndView modelAndView = new ModelAndView("index");
		 * modelAndView.addObject("employeeList",
		 * this.employeeRepository.getEmployeeList()); return modelAndView;
		 */
		
		return "redirect:/";
	}
	

}
