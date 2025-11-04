package org.example;

public class Laptop implements ElectronicDevice {
    private String brand;
    private String model;
    private boolean isOn;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Ноутбук " + brand + " " + model + " включен!");
        } else {
            System.out.println("Ноутбук " + brand + " " + model + " уже включен.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Ноутбук " + brand + " " + model + " выключен.");
        } else {
            System.out.println("Ноутбук " + brand + " " + model + " уже выключен.");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
