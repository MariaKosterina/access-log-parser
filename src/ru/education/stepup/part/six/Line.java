package ru.education.stepup.part.six;

public class Line {
    private Point start;
    private Point end;

    //Конструктор через точки.
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    //Конструктор через координаты.
    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart() { return start; }
    public Point getEnd() { return end; }

    //Задаем вычисление длины линии.
    public double getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Линия от точки " + start + " до точки " + end;
    }
}