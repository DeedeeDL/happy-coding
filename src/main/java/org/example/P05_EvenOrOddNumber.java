package org.example;

public class P05_EvenOrOddNumber {
    public static boolean isEven(int number) {
        boolean result;
        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
