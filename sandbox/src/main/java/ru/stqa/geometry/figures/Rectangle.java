package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double a, double b) {
        System.out.println("Площать прямоугольника = " + rectangleAre(a, b));
    }

    private static double rectangleAre(double a, double b) {
        return a * b;
    }
}
