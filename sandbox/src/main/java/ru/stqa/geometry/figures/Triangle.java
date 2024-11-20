package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {

    public static void printTrianglePerimentr(Triangle triangle) {
        System.out.println("Периметр треугольника = " + triangle.perimetr());
    }

    public static void printTriangleArea(Triangle triangle) {
        System.out.println("Площадь треугольника = " + triangle.area());
    }

    public double perimetr() {
        return a + b + c;
    }

    public Object area() {
        double p = (a + b + c)/2;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
