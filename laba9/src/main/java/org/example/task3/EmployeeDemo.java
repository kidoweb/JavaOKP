package org.example.task3;

import java.util.*;

public class EmployeeDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FixedSalaryEmployee("Иванов", 2500.50));
        employees.add(new HourlySalaryEmployee("Петров", 20.5));
        employees.add(new FixedSalaryEmployee("Сидоров", 1800.25));
        employees.add(new HourlySalaryEmployee("Козлов", 35.0));
        employees.add(new FixedSalaryEmployee("Морозов", 2800.80));
        employees.add(new HourlySalaryEmployee("Алексеев", 18.75));
        employees.add(new FixedSalaryEmployee("Борисов", 3200.75));
        employees.add(new HourlySalaryEmployee("Давыдов", 25.0));

        employees.sort(
                Comparator
                        .comparingDouble(Employee::avg)
                        .reversed()
                        .thenComparing(Employee::getName)
        );

        for (Employee e : employees) {
            System.out.printf("%d %s %.2f%n", e.getId(), e.getName(), e.avg());
        }

        employees.stream()
                .limit(5)
                .forEach(e -> System.out.println(e.getName()));

        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .forEach(e -> System.out.println(e.getId()));
    }
}


