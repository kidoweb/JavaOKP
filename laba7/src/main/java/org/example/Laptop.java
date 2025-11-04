package org.example;

public class Laptop extends ElectronicDevice {
    public Laptop(int dem) {
        super(dem);
    }

    @Override
    public void turnOn() {
        System.out.println("Ноутбук включается: загрузка операционной системы...");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Ноутбук выключается: завершение работы...");
    }
    public void displayinfo(){
        System.out.println("Я обычный метод");
    }
}


