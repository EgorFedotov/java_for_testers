package ru.stqa.geometry.figures;

public record Square(double side) {

    public Square {
        if (side < 0){
            throw new IllegalArgumentException("Square side should be not-negative");
        }
    }

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
