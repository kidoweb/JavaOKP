package org.example.task3;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Employee {
    private static final AtomicInteger ID_SEQUENCE = new AtomicInteger(1);

    private final int id;
    private final String name;

    protected Employee(String name) {
        this.id = ID_SEQUENCE.getAndIncrement();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double avg();
}


