package ru.education.stepup.part.seven;

public class Fraction {
    //Определяем объекты дроби как неизменяемые.
    private final int numerator;
    private final int denominator;

    //Конструктор.
    public Fraction(int numerator, int denominator) {
        //Делаем проверку на то, что знаменатель больше 0, иначе кидаем ошибку.
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть > 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Описываем сложение с дробью
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator +
                other.numerator * this.denominator;

        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    //Описываем сложение с числом
    public Fraction sum(int number) {
        int newNumerator = this.numerator + number * this.denominator;
        return new Fraction(newNumerator, this.denominator);
    }

    //Описываем вычитание дроби
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator -
                other.numerator * this.denominator;

        int newDenominator = this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    //Описываем вычитание числа
    public Fraction minus(int number) {
        int newNumerator = this.numerator - number * this.denominator;
        return new Fraction(newNumerator, this.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;  //Возвращается строковое значение вида "числитель/знаменатель".
    }
}