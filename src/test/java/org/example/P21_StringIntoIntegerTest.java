package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P21_StringIntoIntegerTest {
    @Test
    void getNumber() {
        String text= "1234";
        int number = P21_StringIntoInteger.getNumber(text);
        assertEquals("1234", text);

    }
}