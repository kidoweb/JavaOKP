package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        File file = new File("temperatures.txt");

        double[] temps = new double[5];
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US); 
            System.out.println("Введите 5 вещественных значений температуры (через Enter):");
            for (int i = 0; i < temps.length; i++) {
                while (!scanner.hasNextDouble()) {
                    System.out.println("Некорректный ввод, введите число:");
                    scanner.next();
                }
                temps[i] = scanner.nextDouble();
            }
        }

        try (OutputStream out = new FileOutputStream(file)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temps.length; i++) {
                if (i > 0) sb.append('\n');
                sb.append(temps[i]);
            }
            out.write(sb.toString().getBytes(StandardCharsets.UTF_8));
            out.flush();
        }

        double sum = 0.0;
        int count = 0;
        try (InputStream in = new FileInputStream(file); Scanner fs = new Scanner(in)) {
            fs.useLocale(Locale.US);
            while (fs.hasNext()) {
                if (fs.hasNextDouble()) {
                    sum += fs.nextDouble();
                    count++;
                } else {
                    fs.next();
                }
            }
        }

        if (count == 0) {
            throw new Exception("Файл пуст или не содержит чисел.");
        } else {
            double avg = sum / count;
            System.out.println("Средняя температура: " + avg);
        }
    }
}


