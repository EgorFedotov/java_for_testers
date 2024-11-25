package ru.stqa.geometry.figures;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(this.a, rectangle.a) == 0 && Double.compare(this.b, rectangle.b) == 0) ||
                (Double.compare(this.b, rectangle.a) == 0 && Double.compare(this.a, rectangle.b)== 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
