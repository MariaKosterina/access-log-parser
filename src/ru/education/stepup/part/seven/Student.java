package ru.education.stepup.part.seven;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    //Конструктор только с именем, оценка может быть пустая.
    public Student(String name) {
        this.name = name;
        this.grades = new int[0];
    }

    //Конструктор с именем и оценками.
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            validateGrade(grades[i]);
            this.grades[i] = grades[i];
        }
    }

    //Добавление оценки.
    public void addGrade(int grade) {
        validateGrade(grade);

        int[] newGrades = new int[grades.length + 1];
        System.arraycopy(grades, 0, newGrades, 0, grades.length);
        newGrades[grades.length] = grade;

        grades = newGrades;
    }

    //Получение оценок (копия).
    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    //Проверка оценки (принадлежность допустимому диапазону).
    private void validateGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}