package org.example;

import java.util.Scanner;

public class P07_LeapYear {
    public static boolean isLeapYear(int myYear) {

        boolean result;
        if (myYear % 4 == 0) {
            if (myYear % 100 == 0) {
                if (myYear % 400 == 0) {
                    result = true;
                } else {
                    result = false;
                }
            } else {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }
}

