package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_09_AsterixTrianglePatternTest {

    @Test
    void generateAsterixTriangle() {
        int rows = 5;

        String result = C03_09_AsterixTrianglePattern.generateAsterixTriangle(rows);

        assertEquals("""
                 *\s
                 *  *\s
                 *  *  *\s
                 *  *  *  *\s
                 *  *  *  *  *\s
                """, result);
    }
}