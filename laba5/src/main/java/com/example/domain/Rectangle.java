package com.example.domain;

public class Rectangle extends GeometricFigure {
    private double width;
    private double height;
    
    public Rectangle() {
        super("Прямоугольник", "Зеленый");
        this.width = 1.0;
        this.height = 1.0;
        calculateArea();
    }
    
    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
        calculateArea();
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
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
        this.area = width * height;
        return this.area;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Ширина: " + String.format("%.2f", width));
        super.displayInfo();
        System.out.println("Высота: " + String.format("%.2f", height));
    }
}
