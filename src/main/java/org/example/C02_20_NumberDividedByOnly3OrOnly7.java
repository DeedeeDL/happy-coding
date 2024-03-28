package org.example;

import java.util.Scanner;

public class C02_20_NumberDividedByOnly3OrOnly7 {
    public static boolean isDivided (int number){
        boolean result;
        if (number % 3 == 0 && number % 7 == 0) {
            result = false;
        } else if (number % 3 == 0 || number % 7 == 0) {
           result = true;
        } else {
            result = false;
        }
        return result;
    }
}
