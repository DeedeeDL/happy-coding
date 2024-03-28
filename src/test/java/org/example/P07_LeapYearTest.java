package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P07_LeapYearTest {

    @Test
    void year_evenly_divisible_by_400_is_leap_year() {
        int myYear = 2024;

        boolean result = P07_LeapYear.isLeapYear(myYear);

        assertTrue(result);
    }

    @Test
    void year_evenly_divisible_by_100_but_not_by_400_is_not_leap_year() {
        int myYear = 2023;

        boolean result = P07_LeapYear.isLeapYear(myYear);

        assertFalse(result);
    }
}