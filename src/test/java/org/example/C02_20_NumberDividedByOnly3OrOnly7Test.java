package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C02_20_NumberDividedByOnly3OrOnly7_Test {

    @Test
    void number_is_divided_only_by_3 () {
        int number = 9;

        boolean result = C02_20_NumberDividedByOnly3OrOnly7.isDivided(number);

        assertTrue(result);
    }

    @Test
    void number_is_divided_only_by_7() {
        int number = 7;

        boolean result = C02_20_NumberDividedByOnly3OrOnly7.isDivided(number);

        assertTrue(result);
    }
    @Test
    void number_is_divided_by_7_and_by_3() {
        int number = 21;

        boolean result = C02_20_NumberDividedByOnly3OrOnly7.isDivided(number);

        assertFalse(result);
    }
}