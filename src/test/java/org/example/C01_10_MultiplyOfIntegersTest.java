package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_10_MultiplyOfIntegersTest {

    @Test
    public void multiply() {
        //given input
        int num1 = 5;
        int num2 = 6;

        //method call
        int multiplication = C01_10_MultiplyOfIntegers.multiply(num1, num2);


        //assert the result
        assertEquals(30, multiplication);
    }
}
