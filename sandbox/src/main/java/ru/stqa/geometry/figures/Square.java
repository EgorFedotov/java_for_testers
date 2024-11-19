package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println("площать квадрата = " + squareArea(side));
    }

    private static double squareArea(double side) {
        return side * side;
    }
}
