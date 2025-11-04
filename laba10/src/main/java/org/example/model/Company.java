package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private final List<Department> departments = new ArrayList<>();

	public Company(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("Название компании не может быть null");
		}
		String trimmed = name.trim();
		if (trimmed.isEmpty()) {
			throw new IllegalArgumentException("Название компании не может быть пустым");
		}
		this.name = trimmed;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void addDepartment(Department department) {
		if (department != null) {
			departments.add(department);
		}
	}
}


