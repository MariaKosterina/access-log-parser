package ru.education.stepup.part.seven;

public class MainCheckFraction {
    public static void main(String[] args) {
        //Задаем значение дробей.
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        System.out.println("Значения:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        System.out.println("Вычисляем: (( "+f1+" + "+f2+" ) + "+f3+" ) - 5");
        //Вычисляем результат:
        Fraction result = f1.sum(f2).sum(f3).minus(5);
        System.out.println("Результат: " + result);
    }
}
