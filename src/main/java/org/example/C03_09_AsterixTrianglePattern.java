package org.example;
import java.util.Scanner;
public class C03_09_AsterixTrianglePattern {

    public static String generateAsterixTriangle(int rows) {
        String result = "";
        // Loop through each row
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                result += " * ";
            }

            result += "\n";
        }
        return result;
    }
}
