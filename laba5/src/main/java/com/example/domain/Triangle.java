package com.example.domain;

public class Triangle extends GeometricFigure {
    private double base;
    private double height;
    
    public Triangle() {
        super("Треугольник", "Красный");
        this.base = 1.0;
        this.height = 1.0;
        calculateArea();
    }
    
    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
        calculateArea();
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
        calculateArea();
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
        calculateArea();
    }
    
    @Override
    public double calculateArea() {
        this.area = (base * height) / 2.0;
        return this.area;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основание: " + String.format("%.2f", base));
        System.out.println("Высота: " + String.format("%.2f", height));
    }
}
