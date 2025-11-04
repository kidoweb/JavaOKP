package com.example.domain;

public class GeometricFigure {
    protected String name;
    protected String color;
    protected double area;
    
    public GeometricFigure() {
        this.name = "Неизвестная фигура";
        this.color = "Белый";
        this.area = 0.0;
    }
    
    public GeometricFigure(String name, String color) {
        this.name = name;
        this.color = color;
        this.area = 0.0;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public double calculateArea() {
        return area;
    }
    
    public void displayInfo() {
        System.out.println("Фигура: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + String.format("%.2f", area));
    }
}
