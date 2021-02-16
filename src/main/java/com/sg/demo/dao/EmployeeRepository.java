package com.sg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sg.demo.entity.EmployeeEntity;
import com.sg.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
