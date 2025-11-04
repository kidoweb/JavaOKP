package org.example.task3;

public class HourlySalaryEmployee extends Employee {
    private final double rate;

    public HourlySalaryEmployee(String name, double hourlyRate) {
        super(name);
        this.rate = hourlyRate;
    }

    @Override
    public double avg() {
        return 20.8 * 8 * rate;
    }
}


