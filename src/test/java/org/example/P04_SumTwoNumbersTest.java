package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P04_SumTwoNumbersTest {

    @Test
    public void sum() {
        //given input
        int number1 = 5;
        int number2 = 6;

        //method call
        int sum = P04_SumTwoNumbers.sum(number1, number2);


        //assert the result
        assertEquals(11, sum);
    }
}
