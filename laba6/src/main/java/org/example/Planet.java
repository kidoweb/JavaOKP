package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Planet {
    private final String name;
    private final List<Continent> conts = new ArrayList<>();
    private final List<Ocean> seas = new ArrayList<>();
    private final List<Island> isls = new ArrayList<>();

    public Planet(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название планеты не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addContinent(Continent c) {
        if (c != null) conts.add(c);
    }

    public void addOcean(Ocean o) {
        if (o != null) seas.add(o);
    }

    public void addIsland(Island i) {
        if (i != null) isls.add(i);
    }

    public List<Continent> getContinents() {
        return Collections.unmodifiableList(conts);
    }

    public List<Ocean> getOceans() {
        return Collections.unmodifiableList(seas);
    }

    public List<Island> getIslands() {
        return Collections.unmodifiableList(isls);
    }

    public int getContinentCount() {
        return conts.size();
    }
}


