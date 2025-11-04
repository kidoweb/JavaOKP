package org.example.model;

import org.example.exceptions.OkladException;

public class ContractEmployee extends Employee {
    public ContractEmployee(String fullName, String position, double baseSalary) throws OkladException {
        super(fullName, position, baseSalary);
    }

	@Override
	public double calculateSalary() {
		try {
			return getBaseSalary();
		} catch (Exception e) {
			System.out.println("Ошибка расчёта зарплаты (контракт): " + e.getMessage());
			return 0.0;
		}


	}
}


