package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) throws Exception {
        File infoFile = new File("me.txt");

        String info = "ФИО: Жешко Вадим Андреевич\n" +
                "Группа: Т-319\n" +
                "О себе: Хочу ужасно спать.\n";

        try (OutputStream out = new FileOutputStream(infoFile)) {
            byte[] data = info.getBytes(StandardCharsets.UTF_8);
            out.write(data);
            out.flush();
        }

        printFileInfo(infoFile);

        try (InputStream in = new FileInputStream(infoFile)) {
            int available = in.available();
            byte[] buf = new byte[available];
            int read = in.read(buf);
            if (read > 0) {
                String text = new String(buf, 0, read, StandardCharsets.UTF_8);
                System.out.println("\nСодержимое файла:");
                System.out.println(text);
            }
        }
    }

    private static void printFileInfo(File file) {
        System.out.println("Информация о файле:");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер файла: " + file.length() + " байт");
        System.out.println("Последнее изменение: " + file.lastModified());
        System.out.println("Родитель: " + file.getParent());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Файл " + (file.exists() ? "существует" : "не существует"));
        System.out.println(file.canRead() ? "можно читать" : "нельзя читать");
        System.out.println(file.canWrite() ? "можно писать" : "нельзя писать");
        System.out.println("Это " + (file.isDirectory() ? "" : "не ") + "директория");
        System.out.println("Это " + (file.isAbsolute() ? "абсолютный" : "не абсолютный") +
                (file.isFile() ? " обычный файл" : " именованный канал"));
    }
}


