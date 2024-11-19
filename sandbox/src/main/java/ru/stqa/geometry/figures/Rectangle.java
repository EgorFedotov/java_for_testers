package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double a, double b) {
        String text = String.format("Площать прямоугольника со сторонами %f и %f = %f", a,b,rectangleAre(a,b));
        System.out.println(text);
    }

    private static double rectangleAre(double a, double b) {
        return a * b;
    }
}
