package org.example;

import java.util.Scanner;

public class C03_13_PyramidPatternWithNumbersIncreasedByOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of rows: ");
        int rows = scanner.nextInt();
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + "   ");
                number++;
            }
            System.out.println();
        }

    }
}

