package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {

    public Rectangle {
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
    }

    public static void printRectangleArea(double a, double b) {
        String text = String.format("Площать прямоугольника со сторонами %f и %f = %f", a,b,rectangleAre(a,b));
        System.out.println(text);
    }

    private static double rectangleAre(double a, double b) {
        return a * b;
    }
}
