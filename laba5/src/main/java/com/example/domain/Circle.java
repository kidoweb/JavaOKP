package com.example.domain;

public class Circle extends GeometricFigure {
    private double radius;
    
    public Circle() {
        super("Круг", "Синий");
        this.radius = 1.0;
        calculateArea();
    }
    
    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
        calculateArea();
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
    }
    
    @Override
    public double calculateArea() {
        this.area = Math.PI * radius * radius;
        return this.area;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Радиус: " + String.format("%.2f", radius));
    }
}
