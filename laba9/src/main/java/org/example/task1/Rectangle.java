package org.example.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
}

