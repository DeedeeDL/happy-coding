package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P17_rectangleAreaTest {
    @Test
    void areaOfRectangle() {

            int width = 5;
            int height = 6;
            int area = P17_rectangleArea.AreaOfRectangle(width, height);
            assertEquals(30, area);
    }
}