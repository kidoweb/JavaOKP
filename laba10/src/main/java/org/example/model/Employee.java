package org.example.model;

import org.example.exceptions.OkladException;

public abstract class Employee {
	private String fullName;
	private String position;
	private double baseSalary;

	public Employee(String fullName, String position, double baseSalary) throws OkladException {
		if (fullName == null) {
			throw new NullPointerException("ФИО не может быть null");
		}
		String fn = fullName.trim();
		if (fn.isEmpty()) {
			throw new IllegalArgumentException("ФИО не может быть пустым");
		}
		if (position == null) {
			throw new NullPointerException("Должность не может быть null");
		}
		String pos = position.trim();
		if (pos.isEmpty()) {
			throw new IllegalArgumentException("Должность не может быть пустой");
		}
		if (Double.isNaN(baseSalary) || Double.isInfinite(baseSalary)) {
			throw new IllegalArgumentException("Оклад содержит некорректное значение");
		}
		if (baseSalary < 0) {
			throw new OkladException("Отрицательный оклад", baseSalary);
		}
		this.fullName = fn;
		this.position = pos;
		this.baseSalary = baseSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		if (fullName == null) {
			throw new NullPointerException("ФИО не может быть null");
		}
		String fn = fullName.trim();
		if (fn.isEmpty()) {
			throw new IllegalArgumentException("ФИО не может быть пустым");
		}
		this.fullName = fn;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (position == null) {
			throw new NullPointerException("Должность не может быть null");
		}
		String pos = position.trim();
		if (pos.isEmpty()) {
			throw new IllegalArgumentException("Должность не может быть пустой");
		}
		this.position = pos;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) throws OkladException {
		if (Double.isNaN(baseSalary) || Double.isInfinite(baseSalary)) {
			throw new IllegalArgumentException("Оклад содержит некорректное значение");
		}
		if (baseSalary < 0) {
			throw new OkladException("Отрицательный оклад", baseSalary);
		}
		this.baseSalary = baseSalary;
	}

	public abstract double calculateSalary();
}


