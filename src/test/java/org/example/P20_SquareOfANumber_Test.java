package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P20_SquareOfANumber_Test {
    @Test
    public void square() {
        int num = 5;
        int square = P29_SquareOfANumber.square(num);
        assertEquals(25, square);
    }
}

