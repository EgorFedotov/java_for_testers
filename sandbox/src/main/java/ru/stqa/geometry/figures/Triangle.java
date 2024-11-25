package ru.stqa.geometry.figures;

import java.util.Objects;

public record Triangle(double a, double b, double c) {

    public Triangle{
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException("Triangle side should be non negative");
        } else if ((a+b)<c || (a+c)<b || (b+c)<a) {
            throw new IllegalArgumentException("Sides of triangles cannot be less then one side");
        }
    }

    public static void printTrianglePerimentr(Triangle triangle) {
        System.out.println("Периметр треугольника = " + triangle.perimetr());
    }

    public static void printTriangleArea(Triangle triangle) {
        System.out.println("Площадь треугольника = " + triangle.area());
    }

    public double perimetr() {
        return a + b + c;
    }

    public double area() {
        double p = (a + b + c)/2;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.c) == 0 && Double.compare(this.c, triangle.b) == 0)
                || (Double.compare(this.a, triangle.c) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.a) == 0)
                || (Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0 && Double.compare(this.c, triangle.a) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
