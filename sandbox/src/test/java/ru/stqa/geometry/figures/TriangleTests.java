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
}
