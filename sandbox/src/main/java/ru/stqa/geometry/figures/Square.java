package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        String text = (String.format("площать квадрата = %f", Area(side)));
        System.out.println(text);
    }

    static double Area(double side) {
        return side * side;
    }

    public static double perimetr(double a) {
        return 4 * a;
    }
}
