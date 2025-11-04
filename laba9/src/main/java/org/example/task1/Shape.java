package org.example.task1;

public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return name + " (площадь: " + String.format("%.2f", area()) + ")";
    }
}

