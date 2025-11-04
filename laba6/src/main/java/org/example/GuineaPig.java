package org.example;

public class GuineaPig {
    public static final String TYPE = "Морская свинка";

    private String n;
    int w;
    protected int a;

    public GuineaPig() {
        this("Безымянная", 600, 2);
    }

    public GuineaPig(String name, int weightGrams, int ageMonths) {
        setName(name);
        if (weightGrams <= 0) {
            throw new IllegalArgumentException("Вес должен быть > 0");
        }
        if (ageMonths < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.w = weightGrams;
        this.a = ageMonths;
    }

    public String getName() {
        return n;
    }

    public void setName(String name) {
        if (!isName(name)) {
            throw new IllegalArgumentException("Некорректное имя");
        }
        this.n = name;
    }

    public int getWeight() {
        return w;
    }

    public int getAge() {
        return a;
    }

    public void squeak() {
        System.out.println(n + ": пи-пи!");
    }

    public void feed(int grams) {
        if (grams <= 0) return;
        w += grams / 10;
    }

    protected void ageUp(int months) {
        if (months > 0) a += months;
    }

    String info() {
        return String.format("%s '%s': %d г, %d мес.", TYPE, n, w, a);
    }

    private boolean isName(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
