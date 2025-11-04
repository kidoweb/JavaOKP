package org.example.task3;

public class FixedSalaryEmployee extends Employee {
    private final double monthly;

    public FixedSalaryEmployee(String name, double monthlySalary) {
        super(name);
        this.monthly = monthlySalary;
    }

    @Override
    public double avg() {
        return monthly;
    }
}


