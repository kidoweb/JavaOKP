package org.example;

class Tester {
    private String name;
    private String surname;
    private int experience;
    private String english;
    private double salary;

    public Tester(String name) {
        this(name, "Unknown");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int experience, String english, double salary) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.english = english;
        this.salary = salary;
    }

    public void show() {
        System.out.println("Тестировщик: " + name + " " + surname);
    }

    public void show(boolean detailed) {
        if (detailed) {
            System.out.println("Полная информация: " + name + " " + surname + 
                             ", опыт: " + experience + " лет, английский: " + english + 
                             ", зарплата: " + salary);
        } else {
            show();
        }
    }

    public void show(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname);
    }

    public static void info() {
        System.out.println("Компания занимается тестированием программного обеспечения");
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getExperience() { return experience; }
    public String getEnglish() { return english; }
    public double getSalary() { return salary; }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Александр!");

        Tester t1 = new Tester("Иван");
        Tester t2 = new Tester("Мария", "Петрова");
        Tester t3 = new Tester("Алексей", "Сидоров", 5, "Upper-Intermediate", 80000.0);

        System.out.println("\nИнформация о тестировщиках:");
        t1.show();
        t2.show(true);
        t3.show("Старший тестировщик");

        System.out.println("\nИнформация о компании:");
        Tester.info();
    }
}