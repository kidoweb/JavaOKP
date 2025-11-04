package org.example;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice laptop = new Laptop(12);
        Laptop l1 = new Laptop(12);
        ElectronicDevice smartphone = new Smartphone(19);
        l1.turnOn();
        laptop.turnOn();
        laptop.turnOff();
        smartphone.turnOn();
        smartphone.turnOff();
        laptop.printinfo();
        l1.printinfo();
        l1.displayinfo();
        laptop.display
    }
}