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

    @Test
    void testEquality(){
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2= new Triangle(3.0, 4.0, 5.0);
        Assertions.assertEquals(t1, t2);
        System.out.println("Треугольники равны");
    }

    @Test
    void testEquality2(){
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(3.0, 5.0, 4.0);
        var t3 = new Triangle(4.0, 5.0, 3.0);
        var t4 = new Triangle(4.0, 3.0, 5.0);
        var t5 = new Triangle(5.0, 4.0, 3.0);
        var t6 = new Triangle(5.0, 3.0, 4.0);
        Assertions.assertEquals(t1, t2);
        Assertions.assertEquals(t2, t3);
        Assertions.assertEquals(t3, t4);
        Assertions.assertEquals(t4, t5);
        Assertions.assertEquals(t5, t6);
        System.out.println("Треугольники равны");
    }
}
