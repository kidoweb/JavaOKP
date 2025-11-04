package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Вадим Жешко");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");
        
        System.out.println("ID сотрудника: " + emp.getEmpId());
        System.out.println("Имя сотрудника: " + emp.getName());
        System.out.println("Номер соц. страхования: " + emp.getSsn());
        System.out.println("Зарплата сотрудника: " + emp.getSalary());
    }
}
