package ru.education.stepup.part.ten;

import java.util.*;

public class Collections101 {
    public static void main(String[] args) {
        int N = 10; // Используем только четное число
        List<Integer> list = new ArrayList<>();
        // Заполняем список
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        System.out.println("Изначальный вид массива: " + list);
        // Замена элементов массива попарно
        for (int i = 0; i < list.size(); i += 2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
        System.out.println("Массив после попарной замены элементов: " + list);
    }
}
/*
//Более короткий вариант (через Collections.swap)
for (int i = 0; i < list.size(); i += 2) {
    Collections.swap(list, i, i + 1);
}
 */