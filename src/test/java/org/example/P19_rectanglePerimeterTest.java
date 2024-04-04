package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P19_rectanglePerimeterTest {
    @Test
    public void perimeterOfRectangle() {

        int width = 5;
        int height = 6;
        int sum = P19_rectanglePerimeter.perimeter(width, height);
        assertEquals(22, sum);
    }

}