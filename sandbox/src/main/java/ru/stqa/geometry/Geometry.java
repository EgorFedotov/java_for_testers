package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(9.2));
        Rectangle.printRectangleArea(9.0, 5.7);
        Triangle.printTrianglePerimentr(new Triangle(3.0, 3.0, 3.0));
        Triangle.printTriangleArea(new Triangle(3.0, 3.0, 3.0));
    }
}
