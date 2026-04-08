package ru.education.stepup.part.six;

public class MainCheckPoint {
    public static void main(String[] args) {
        //Создаем объекты с заданием значений.
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);

        //Выводим на экран текстовое представление этих объектов точек.
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //Сравниваем все эти точки между собой. Результатом всех сравнений будет false,
        //так как в equals здесь сравнивает по умолчанию ссылки на объект, а не их значение.
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
    }
}
