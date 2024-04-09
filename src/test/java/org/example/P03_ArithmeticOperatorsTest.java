package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P03_ArithmeticOperatorsTest {
    @Test
    void arithmeticOperation() {
        int result = 9 + 6 - 3 * 4 / 2 % 5;
        int operation = P03_ArithmeticOperators.arithmetic();
        assertEquals(14, operation); // The correct result should be 11, not 14.
    }
}