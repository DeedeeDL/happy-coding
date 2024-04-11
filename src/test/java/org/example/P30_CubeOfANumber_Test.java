package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P30_CubeOfANumber_Test {

    @Test
    public void cube() {
        //given input
        int number = 5;
        //method call
        int cube = P30_CubeOfANumber.cube(number);
        //assert the result
        assertEquals(125, cube);
    }
}