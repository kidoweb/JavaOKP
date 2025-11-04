package org.example.task2;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;
    
    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }
    
    public void add(String subject, int grade) {
        grades.put(subject, grade);
    }
    
    public Integer get(String subject) {
        return grades.get(subject);
    }
    
    public Map<String, Integer> grades() {
        return new HashMap<>(grades);
    }
    
    public double avg() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    public void nextCourse() {
        this.course++;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGroup() {
        return group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    public int getCourse() {
        return course;
    }
    
    public void setCourse(int course) {
        this.course = course;
    }
    
    @Override
    public String toString() {
        return String.format("Студент: %s, Группа: %s, Курс: %d, Средний балл: %.2f", 
                           name, group, course, avg());
    }
}

