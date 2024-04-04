package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P20_SumOfDigitsTest {

    @Test
    void digitsSum() {
        int number = 222;
        int sum = P20_SumOfDigits.extracted(number);
        assertEquals(6, sum);
    }
}