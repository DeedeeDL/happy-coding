package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P15_sixNumbersTest {
    @Test
    void sixNumbersAverage() {
        int num1 = 2;
        int num2 = 3;
        int num3 = 5;
        int num4 = 10;
        int num5 = 20;
        int num6 = 20;

        int average = P15_sixNumbers.averageOfSixNumbers(num1, num2, num3, num4, num5, num6);

        assertEquals(10, average);

    }
}