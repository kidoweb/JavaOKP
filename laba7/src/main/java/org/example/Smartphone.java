package org.example;

public class Smartphone extends ElectronicDevice {

    public Smartphone(int dem) {
        super(dem);
    }

    @Override
    public void turnOn() {
        System.out.println("Смартфон включается: загрузка, анимация и инициализация приложений...");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Смартфон выключается: завершение работы...");
    }
}


