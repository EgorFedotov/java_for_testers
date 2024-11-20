package ru.stqa.geometry.figures;

public record Square(double side) {


    public static void printSquareArea(Square s) {
        String text = (String.format("площать квадрата со стороной %f = %f", s.side, s.area()));
        System.out.println(text);
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimetr() {
        return this.side * 4;
    }
}
