package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P07_LeapYearTest {

    @Test
    void myYear_is_leap() {
        int myYear = 2000;

        boolean result = P07_LeapYear.isLeapYear(myYear);

        assertTrue(result);
    }

    @Test
    void myYear_is_not_leap() {
        int myYear = 1900;

        boolean result = P07_LeapYear.isLeapYear(myYear);

        assertFalse(result);
    }
}