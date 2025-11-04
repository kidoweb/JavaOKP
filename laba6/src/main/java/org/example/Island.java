package org.example;

public class Island {
    private final String name;

    public Island(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название острова не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


