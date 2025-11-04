package org.example;

public class Continent {
    private final String name;

    public Continent(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название материка не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


