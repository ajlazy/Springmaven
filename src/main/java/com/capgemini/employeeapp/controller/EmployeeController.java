package com.capgemini.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.employeeapp.entity.Employee;
import com.capgemini.employeeapp.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage() {
		return "index";
	}
	@RequestMapping(value="/addEmployeePAge", method=RequestMethod.GET)
	public String getAddEmployeePAge() {
	return "addEmployeeForm";
	}
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public String addNewEmployee(@ModelAttribute Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/findAllEmployees";
	
	}
	
	@RequestMapping(value="findAllEmployees",method=RequestMethod.GET)
	public String getAllEmployeeDetails(Model model) {
		List<Employee> employees=employeeService.findAllEmployees();
		model.addAttribute("allEmployees",employees);
		return "allEmployees";
		
	}
	@RequestMapping(value="/deleteEmployee/{emp}",method=RequestMethod.GET)
	public String deleteEmployee(@PathVariable int employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "redirect:/findAllEmployees";
	}
	@RequestMapping(value="/editEmployeePage/{employeeId}",method=RequestMethod.GET)
	public String editEmployeePage(@PathVariable int employeeId,Model model) {
		employeeService.findEmployeeById(employeeId);
		Employee employee=employeeService.findEmployeeById(employeeId);
		model.addAttribute("employee",employee);
		return "updateEmployeeForm";
	}
		
		@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
		public String updateEmployee(@ModelAttribute Employee employee)
		{
			employeeService.updateEmployee(employee);
			return "redirect:/findAllEmployees";

			
		}
		
	
	}

