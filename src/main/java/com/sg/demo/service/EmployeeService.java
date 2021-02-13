package com.sg.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.demo.dao.EmployeeDao;
import com.sg.demo.dao.EmployeeRepository;
import com.sg.demo.entity.EmployeeEntity;
import com.sg.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();

		employeeDao.getAll().forEach(e -> {
			employees.add(new Employee(e.getId(), e.getName(), e.getDepartName()));
		});
		return employees;
	}

	public void saveEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity(employee.getName(), employee.getDepartName());
		employeeDao.save(employeeEntity);
	}
}
