package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P19_rectanglePerimeterTest {
    @Test
    public void perimeter() {

        int width = 5;
        int height = 6;
        int sum = P19_rectanglePerimeter.sum(width, height);
        assertEquals(22, sum);
    }

}