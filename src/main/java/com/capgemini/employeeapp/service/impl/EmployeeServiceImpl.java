package com.capgemini.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.capgemini.employeeapp.entity.Employee;
import com.capgemini.employeeapp.repository.EmployeeRepository;
import com.capgemini.employeeapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee addEmployee(Employee employee) {
		return repository.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repository.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {

		return repository.deleteEmployee(employeeId);
	}

	@Override
	public Employee findEmployeeById(int employeeId) {

		return repository.findEmployeeById(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {

		return repository.findAllEmployees();
	}

}
