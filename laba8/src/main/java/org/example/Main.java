package org.example;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "Inspiron 15");
        
        laptop.turnOn();
        
        laptop.turnOn();
        
        laptop.turnOff();

        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S24", 85);
        
        smartphone1.turnOn();
        
        smartphone1.turnOff();

        Smartphone smartphone2 = new Smartphone("iPhone", "15 Pro", 0);
        
        smartphone2.turnOn();

        ElectronicDevice[] devices = {
            new Laptop("HP", "Pavilion"),
            new Smartphone("Xiaomi", "Redmi Note 13", 75)
        };

        for (ElectronicDevice device : devices) {
            device.turnOn();
        }
    }
}