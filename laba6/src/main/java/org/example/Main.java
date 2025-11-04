package org.example;

public class Main {
    public static void main(String[] args) {
        GuineaPig pig = new GuineaPig("Пуфф", 800, 6);
        System.out.println(pig.info());
        pig.feed(50);
        pig.squeak();
        System.out.println("После кормления: " + pig.info());

        Planet earth = new Planet("Земля");
        earth.addContinent(new Continent("Евразия"));
        earth.addContinent(new Continent("Африка"));
        earth.addContinent(new Continent("Северная Америка"));
        earth.addContinent(new Continent("Южная Америка"));
        earth.addContinent(new Continent("Антарктида"));
        earth.addContinent(new Continent("Австралия"));

        earth.addOcean(new Ocean("Тихий океан"));
        earth.addOcean(new Ocean("Атлантический океан"));
        earth.addOcean(new Ocean("Индийский океан"));
        earth.addOcean(new Ocean("Северный Ледовитый океан"));

        earth.addIsland(new Island("Гренландия"));
        earth.addIsland(new Island("Новая Гвинея"));

        System.out.println("Планета: " + earth.getName());
        if (!earth.getContinents().isEmpty()) {
            System.out.println("Пример материка: " + earth.getContinents().get(0).getName());
        }
        System.out.println("Количество материков: " + earth.getContinentCount());
    }
}