package com.sg.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.demo.dao.EmployeeRepository;
import com.sg.demo.entity.EmployeeEntity;
import com.sg.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeeEntity> getEmployees() {
		return employeeRepository.findAll();
	}

	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}
}
