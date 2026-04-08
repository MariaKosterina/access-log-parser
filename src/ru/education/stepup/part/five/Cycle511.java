package ru.education.stepup.part.five;

import java.io.File;
import java.util.Scanner;

public class Cycle511 {
    public static void main(String[] args) {

        int count = 0;

        //Бесконечный цикл.
        while (true) {
            System.out.println("Введите путь к файлу:");

            String path = new Scanner(System.in).nextLine();

            File file = new File(path);

            boolean fileExists = file.exists(); //Проверка, что файл существует.

            boolean isDirectory = file.isDirectory(); //Проверка, является ли указанный путь путем именно к файлу, а не папке.

            //Условия для проверки (на основании полученных значений в переменные boolean, записанных выше).
            if (!fileExists) {
                System.out.println("Файл не существует");
                continue;
            } else if (isDirectory) {
                System.out.println("Указан путь к папке, а не к файлу");
                continue;
            }

            //Если всё ок, т.е. найден указанный файл, то:
            count++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count);
        }
    }
}
