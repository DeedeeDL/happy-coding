package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_10_MultiplicationOfIntegersTest {

    @Test
        public void testMultiplication() {
            // Given input
            int num1 = 5;
            int num2 = 6;

            // Method call
            int multiplicationResult = C01_10_MultiplicationOfIntegers.multiplication(num1, num2);

            // Assert the result
            assertEquals(30, multiplicationResult);
    }
}
