package org.example;

public abstract class ElectronicDevice {
    public int dem;
    public abstract void turnOn();
    public abstract void turnOff();
    public ElectronicDevice(int dem){
        this.dem = dem;
    }
    public void printinfo(){
        System.out.println("я обычная абстракция");
    }
}


