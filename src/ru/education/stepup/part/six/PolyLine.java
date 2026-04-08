package ru.education.stepup.part.six;

import java.util.*;

public class PolyLine {
    private List<Point> points;

    //Задаем конструктор для пустого объекта (при создании объекта можно ничего не указывать).
    public PolyLine() {
        this.points = new ArrayList<>();
    }

    //Задаем конструктор с точками.
    public PolyLine(List<Point> points) {
        this.points = points;
    }

    //Задаем метод для получения линий.
    public Line[] getLines() {
        Line[] lines = new Line[points.size() - 1];

        for (int i = 0; i < points.size() - 1; i++) {
            lines[i] = new Line(points.get(i), points.get(i + 1));
        }

        return lines;
    }

    //Метод для вычисления длины ломаной линии
    public double getLength() {
        double sum = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            int dx = points.get(i + 1).getX() - points.get(i).getX();
            int dy = points.get(i + 1).getY() - points.get(i).getY();
            sum += Math.sqrt(dx * dx + dy * dy);
        }

        return sum;
    }

    @Override
    public String toString() { //Приведение к строковой форме вида.
        return "Линия " + points;
    }
}