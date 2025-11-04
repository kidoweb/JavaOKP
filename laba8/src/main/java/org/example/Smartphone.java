package org.example;

public class Smartphone implements ElectronicDevice {
    private String brand;
    private String model;
    private boolean isOn;
    private int batteryLevel;

    public Smartphone(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            if (batteryLevel > 0) {
                isOn = true;
                System.out.println("Смартфон " + brand + " " + model + " включен! Уровень батареи: " + batteryLevel + "%");
            } else {
                System.out.println("Не удается включить смартфон " + brand + " " + model + ". Батарея разряжена!");
            }
        } else {
            System.out.println("Смартфон " + brand + " " + model + " уже включен.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Смартфон " + brand + " " + model + " выключен.");
        } else {
            System.out.println("Смартфон " + brand + " " + model + " уже выключен.");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isOn=" + isOn +
                ", batteryLevel=" + batteryLevel +
                '}';
    }
}
