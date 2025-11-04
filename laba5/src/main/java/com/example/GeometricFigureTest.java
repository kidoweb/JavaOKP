package com.example;

import com.example.domain.*;

public class GeometricFigureTest {
    
    public static void main(String[] args) {
        Circle circle = new Circle("Круг Вадима", "Синий", 5.0);
        Rectangle rectangle = new Rectangle("Прямоугольник Жешко", "Зеленый", 4.0, 6.0);
        Triangle triangle = new Triangle("Треугольник РБ", "Красный", 3.0, 4.0);
        
        GeometricFigure[] figures = {circle, rectangle, triangle};
        
        for (int i = 0; i < figures.length; i++) {
            figures[i].displayInfo();
            System.out.println();
        }
        
        for (GeometricFigure figure : figures) {
            System.out.println("Фигура: " + figure.getName());
            System.out.println("Площадь: " + String.format("%.2f", figure.calculateArea()));
            System.out.println("Тип фигуры: " + figure.getClass().getSimpleName());
            System.out.println();
        }
        
        circle.setRadius(7.0);
        rectangle.setWidth(8.0);
        rectangle.setHeight(3.0);
        triangle.setBase(6.0);
        triangle.setHeight(8.0);
        
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();
        double triangleArea = triangle.calculateArea();
        
        System.out.println("Площадь круга: " + String.format("%.2f", circleArea));
        System.out.println("Площадь прямоугольника: " + String.format("%.2f", rectangleArea));
        System.out.println("Площадь треугольника: " + String.format("%.2f", triangleArea));
        
        GeometricFigure largestFigure = circle;
        double largestArea = circleArea;
        
        if (rectangleArea > largestArea) {
            largestFigure = rectangle;
            largestArea = rectangleArea;
        }
        if (triangleArea > largestArea) {
            largestFigure = triangle;
            largestArea = triangleArea;
        }
        
        System.out.println("Фигура с наибольшей площадью: " + largestFigure.getName() + 
                          " (площадь: " + String.format("%.2f", largestArea) + ")");
    }
}
