package org.example;

import java.util.Scanner;

public class P20_SumOfDigits {

    public static int digitsSum(int number) {
        int sum = 0;
        while (number != 0) {
            int rest = number % 10;
            sum = sum + rest;
            number = number / 10;
        }
        return sum;

    }

}
