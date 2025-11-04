package org.example.task1;

public class Circle extends Shape {
    private double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }
}

