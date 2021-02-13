package com.sg.demo.model;

public class Employee {

	private int id;
	private String name;
	private String DepartName;

	public Employee(int id, String name, String departName) {
		super();
		this.id = id;
		this.name = name;
		DepartName = departName;
	}

	int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartName() {
		return DepartName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DepartName == null) ? 0 : DepartName.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (DepartName == null) {
			if (other.DepartName != null)
				return false;
		} else if (!DepartName.equals(other.DepartName))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
