package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P05_EvenOrOddNumberTest {

    @Test
    void number_is_even() {
        int number = 6;

        boolean result = P05_EvenOrOddNumber.isEven(number);

        assertTrue(result);
    }

    @Test
    void number_is_odd() {
        int number = 5;

        boolean result = P05_EvenOrOddNumber.isEven(number);

        assertFalse(result);
    }
}