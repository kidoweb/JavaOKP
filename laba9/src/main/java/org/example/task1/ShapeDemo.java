package org.example.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShapeDemo {
    public static void main(String[] args) {
        Map<String, Shape> shapes = new HashMap<>();
        shapes.put("Круг", new Circle("Круг", 5.0));
        shapes.put("Прямоугольник", new Rectangle("Прямоугольник", 4.0, 6.0));
        shapes.put("Треугольник", new Triangle("Треугольник", 3.0, 4.0));

        Set<String> keys = shapes.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        for (Shape s : shapes.values()) {
            System.out.println(s);
        }
    }
}

