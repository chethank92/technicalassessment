package com.sg.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EmployeeEntity {

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String name;

	@Column
	private String DepartName;

	public EmployeeEntity(String name, String departName) {
		super();
		this.name = name;
		DepartName = departName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartName() {
		return DepartName;
	}

}
