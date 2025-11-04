package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int numEmployees;
	private final List<Employee> employees = new ArrayList<>();

	public Department(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("Название отдела не может быть null");
		}
		String trimmed = name.trim();
		if (trimmed.isEmpty()) {
			throw new IllegalArgumentException("Название отдела не может быть пустым");
		}
		this.name = trimmed;
	}

	public int getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(int numEmployees) {
		if (numEmployees < 0) {
			throw new IllegalArgumentException("Количество сотрудников не может быть отрицательным");
		}
		this.numEmployees = numEmployees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		if (employee == null) {
			throw new NullPointerException("Нельзя добавить null-сотрудника");
		}
		employees.add(employee);
		numEmployees = employees.size();
	}
}


