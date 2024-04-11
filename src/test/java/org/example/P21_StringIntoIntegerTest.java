package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P21_StringIntoIntegerTest {
    @Test
    void getNumber() {
        String number = "1234";
        int text = P21_StringIntoInteger.stringToInteger(number);
        assertEquals(1234, text);

    }
}