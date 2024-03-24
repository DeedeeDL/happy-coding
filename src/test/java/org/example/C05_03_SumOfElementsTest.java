package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_03_SumOfElementsTest {

    @Test
    void sumOfElements() {
        int[] input = {1, 1, 2, 3};
        int sum = C05_03_SumOfElements.getSum(input);

        assertEquals(7, sum);
    }
}