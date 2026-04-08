package ru.education.stepup.part.six;

import java.util.*;

public class MainCheckPolyLine {
    public static void main(String[] args) {

        //Создаем точки и задаем значения для них.
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);

        //1. Создаем ломаную линию и указываем в качестве значений для нее созданные точки.
        PolyLine polyLine = new PolyLine(Arrays.asList(p1, p2, p3, p4));

        //2. Рассчитываем длину ломаной линии.
        double polyLength = polyLine.getLength();
        System.out.println("Длина ломаной: " + polyLength);

        //3. Получаем массив линий (входящих в ломаную линию).
        Line[] lines = polyLine.getLines();

        //4. Рассчитываем длину массива линий.
        double linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }

        System.out.println("Длина массива линий (сумма длин линий массива ломаной линии): " + linesLength);

        //5. Сравниваем длину ломаной линии и сумму длин линий из массива ломаной линии.
        System.out.println("Равны ли эти длины: " + (polyLength == linesLength));

        //6. Изменяем точку с {2;8} на {12;8}. Тут достаточно изменить оно значение для точки.
        p2.setX(12);

        System.out.println("\nПосле изменения точки:");
        System.out.println(polyLine);

        //Проверяем, что после изменения координат точки в ломаной и двух линиях массива изменения тоже произошли.
        for (Line line : lines) {
            System.out.println(line);
        }
    }
}
