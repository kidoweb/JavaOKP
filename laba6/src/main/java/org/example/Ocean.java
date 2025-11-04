package org.example;

public class Ocean {
    private final String name;

    public Ocean(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название океана не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


