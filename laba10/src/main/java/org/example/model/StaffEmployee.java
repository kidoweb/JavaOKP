package org.example.model;

import org.example.exceptions.PremiyaException;
import org.example.exceptions.OkladException;

public class StaffEmployee extends Employee {
	private double bonus;

	public StaffEmployee(String fullName, String position, double baseSalary, double bonus) throws OkladException {
		super(fullName, position, baseSalary);
		setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if (Double.isNaN(bonus) || Double.isInfinite(bonus)) {
			throw new IllegalArgumentException("Премия содержит некорректное значение");
		}
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		try {
			if (bonus < 0) {
				throw new PremiyaException("Премия не может быть отрицательной: " + bonus);
			}
			return getBaseSalary() + bonus;
		} catch (PremiyaException e) {
			System.out.println(e.getMessage());
			return getBaseSalary();
		} catch (Exception e) {
			System.out.println("Ошибка расчёта зарплаты (штатный): " + e.getMessage());
			return 0.0;
		}
	}
}


