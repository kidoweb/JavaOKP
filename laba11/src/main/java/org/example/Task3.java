package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private static final Pattern YEAR_PATTERN = Pattern.compile("(^|[^0-9])([0-9]{4})([^0-9]|$)");

    public static void main(String[] args) throws Exception {
        File datesFile = new File("dates.txt");
        if (!datesFile.exists()) {
            throw new Exception("Файл dates.txt не найден.");
        }

        Map<String, List<String>> yearToDates = new HashMap<>();

        try (InputStream in = new FileInputStream(datesFile); Scanner scanner = new Scanner(in, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;
                String year = extractYear(line);
                if (year == null) continue;
                yearToDates.computeIfAbsent(year, k -> new ArrayList<>()).add(line);
            }
        }

        if (yearToDates.isEmpty()) {
            System.out.println("Годы не обнаружены в файле дат.");
            return;
        }

        for (Map.Entry<String, List<String>> e : yearToDates.entrySet()) {
            String year = e.getKey();
            List<String> lines = e.getValue();
            File outFile = new File("year-" + year + ".txt");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lines.size(); i++) {
                if (i > 0) sb.append('\n');
                sb.append(lines.get(i));
            }
            try (OutputStream out = new FileOutputStream(outFile)) {
                out.write(sb.toString().getBytes(StandardCharsets.UTF_8));
                out.flush();
            }
        }

        System.out.println("Разбиение завершено. Созданы файлы: ");
        for (String year : yearToDates.keySet()) {
            System.out.println(" - year-" + year + ".txt (" + yearToDates.get(year).size() + " строк)");
        }
    }

    private static String extractYear(String line) {
        Matcher m = YEAR_PATTERN.matcher(line);
        if (m.find()) {
            return m.group(2);
        }
        return null;
    }
}
