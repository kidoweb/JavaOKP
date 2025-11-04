import exceptions.OkladException;
import model.*;

public class Main {
	public static void main(String[] args) {
		Company company = new Company("Колледж бизнеса и права – Пример");
		Department it = new Department("ИТ-отдел");
		company.addDepartment(it);

		try {
			Employee staffOk = new StaffEmployee("Иванов Иван Иванович", "Разработчик", 2000.0, 500.0);
			Employee contractOk = new ContractEmployee("Петров Пётр Петрович", "Тестировщик", 1500.0);
			it.addEmployee(staffOk);
			it.addEmployee(contractOk);
		} catch (OkladException e) {
			System.out.println("Ошибка при создании корректных сотрудников: " + e.getMessage());
		}

		try {
			Employee staffWithNegBonus = new StaffEmployee("Сидоров Сидор Сидорович", "Аналитик", 2200.0, -300.0);
			it.addEmployee(staffWithNegBonus);
		} catch (OkladException e) {
			System.out.println("Ошибка при создании сотрудника с отрицательной премией: " + e.getMessage());
		}

		try {
			try {
				Employee badSalary = new ContractEmployee("Романов Роман Романович", "Администратор", -1000.0);
				it.addEmployee(badSalary);
			} catch (OkladException e) {
				System.out.println("Невозможно создать сотрудника – указан отрицательный оклад: " + e.getInvalidOklad());
				throw new OkladException("Повторное исключение для демонстрации", e.getInvalidOklad());
			}
		} catch (OkladException e) {
			System.out.println("main обработал повторное исключение OkladException (оклад=" + e.getInvalidOklad() + ")");
		}

		System.out.println("\nРасчёт зарплат:");
		for (Employee emp : it.getEmployees()) {
			double salary = emp.calculateSalary();
			System.out.println(emp.getFullName() + ", должность: " + emp.getPosition() + ", зарплата: " + salary);
		}
	}
}


