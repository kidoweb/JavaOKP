package org.example.task2;

import java.util.*;

public class StudentDemo {
    
    public static void process(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.avg();
            
            if (averageGrade < 3.0) {
                iterator.remove();
            } else {
                student.nextCourse();
            }
        }
    }
    
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        Student student1 = new Student("Иван Петров", "ИТ-21", 1);
        student1.add("Математика", 4);
        student1.add("Физика", 3);
        student1.add("Программирование", 5);
        
        Student student2 = new Student("Мария Сидорова", "ИТ-21", 1);
        student2.add("Математика", 2);
        student2.add("Физика", 2);
        student2.add("Программирование", 3);
        
        Student student3 = new Student("Алексей Козлов", "ИТ-22", 2);
        student3.add("Алгоритмы", 5);
        student3.add("Базы данных", 4);
        student3.add("Веб-разработка", 5);
        
        Student student4 = new Student("Елена Волкова", "ИТ-22", 2);
        student4.add("Алгоритмы", 1);
        student4.add("Базы данных", 2);
        student4.add("Веб-разработка", 2);
        
        Student student5 = new Student("Дмитрий Соколов", "ИТ-23", 3);
        student5.add("Машинное обучение", 4);
        student5.add("Компьютерные сети", 4);
        student5.add("Проектирование ПО", 5);
        
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        
        process(students);
        
        printStudents(students, 1);
        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 4);
    }
}

