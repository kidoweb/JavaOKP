package org.example.task1;

public class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getHeight() {
        return height;
    }
}

