package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_01_NumbersArrayTest {
    @Test
    void createArray() {

        int[] result = C05_01_NumbersArray.createArray(1, 4, 5, 6, 8);

        assertArrayEquals(new int[]{1,4,5,6,8}, result);
    }
}