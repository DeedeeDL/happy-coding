package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P20_SquareOfANumber_Test {
    @Test
    public void square() {
        //given input
        int num = 5;

        //method call
        int square = P29_SquareOfANumber.square(num);

        //assert the result
        assertEquals(25, square);
    }
}

