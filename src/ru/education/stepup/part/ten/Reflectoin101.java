package ru.education.stepup.part.ten;

import java.lang.reflect.Field;
import java.util.*;

public class Reflectoin101 {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("Объект класса до обнуления: " + cat);

        resetFields(cat);

        System.out.println("Объект класса после обнуления: " + cat);
    }

    //Метод для обнуления полей. Метод вынесен отдельно для универсальности.
    public static void resetFields(Object obj) throws IllegalAccessException {
        if (obj == null) return;

        Class<?> classForReset = obj.getClass();

        //Получение всех полей класса (включая private), т.к. используется "Declared".
        Field[] fields = classForReset.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); //Разрешение доступа к private.
            Class<?> type = field.getType();

            //Условие, что если поле не примитив, то тогда обнуляем.
            if (!type.isPrimitive()) {
                field.set(obj, null);
            }
        }
    }
}
