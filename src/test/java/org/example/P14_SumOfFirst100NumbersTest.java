package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P14_SumOfFirst100NumbersTest {

    @Test
    void sum_of_first_100_numbers() {
        int sum = P14_SumOfFirst100Numbers.getSum();

        assertEquals(5050, sum);
    }
}