package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_10_ProductOfIntegersTest {

    @Test
    public void prod() {
        //given input
        int num1 = 5;
        int num2 = 6;

        //method call
        int prod = C01_10_ProductOfIntegers.prod(num1, num2);


        //assert the result
        assertEquals(30, prod);
    }
}
