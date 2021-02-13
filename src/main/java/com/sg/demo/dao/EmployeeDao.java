package com.sg.demo.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sg.demo.entity.EmployeeEntity;

@Component
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
	}

	public List<EmployeeEntity> getAll() {
		List<EmployeeEntity> employeeEntities = new ArrayList<EmployeeEntity>();
		employeeRepository.findAll().forEach(emp -> {
			employeeEntities.add(emp);
		});
		return employeeEntities;
	}
}
