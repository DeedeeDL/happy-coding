package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P20_SumOfDigitsTest {

    @Test
    void digitsSum() {

        int numb = 135;
        int sum = P20_SumOfDigits.digitsSum(numb);
        assertEquals(9, sum);

    }
}