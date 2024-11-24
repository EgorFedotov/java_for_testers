package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimetr(){
        var triangle = new Triangle(3, 3, 3 );
        var result  = triangle.perimetr();
        Assertions.assertEquals(9, result);
        System.out.println("---ТЕСТ ПЕРИМЕТР ТРЕУГОЛЬНРКА ПРОЙДЕН ---");
    }

    @Test
    void canCalculateArea(){
        var tringale_area = new Triangle(3, 3, 3);
        var result  = tringale_area.area();
        Assertions.assertEquals(3.897114317029974, result);
        System.out.println("---ТЕСТ ПЛОЩАДЬ ТРЕУГОЛЬНРКА ПРОЙДЕН ---");
    }

    @Test
    void CanCreateTriangleWithNegativeSides(){
        try {
            new Triangle(3.0, -5.0, 4.0 );
            Assertions.fail();
        }catch (IllegalArgumentException exception){
            System.out.println("Сторона треугольнка не может быть отрицательной!");
        }
    }

    @Test
    void CanCreateTriangleWithUnequalSides(){
        try {
            new Triangle(1,1,6);
            Assertions.fail();
        }catch (IllegalArgumentException exception){
            System.out.println("Сумма двух сторон треугольника не можеть быть меньше третьей");
        }
    }
}
