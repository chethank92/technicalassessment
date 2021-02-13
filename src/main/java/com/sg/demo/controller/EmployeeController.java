package com.sg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.demo.model.Employee;
import com.sg.demo.service.EmployeeService;

@RestController("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(path = "/employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {

		return employeeService.getEmployees();
	}

	@RequestMapping(path = "/employee", method = RequestMethod.POST)
	public void save(@RequestBody Employee employee) {

		employeeService.saveEmployee(employee);
	}
}
