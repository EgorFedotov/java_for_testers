package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        String text = (String.format("площать квадрата = %f", squareArea(side)));
        System.out.println(text);
    }

    private static double squareArea(double side) {
        return side * side;
    }
}
