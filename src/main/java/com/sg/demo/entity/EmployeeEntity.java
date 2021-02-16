package com.sg.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity implements Serializable {

	private static final long serialVersionUID = 3705256181710193359L;

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String name;

	@Column
	private String departmentName;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String name, String departmentName) {
		super();
		this.name = name;
		this.departmentName = departmentName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

}
