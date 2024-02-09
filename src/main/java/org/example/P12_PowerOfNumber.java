package org.example;
import java.util.Scanner;

public class P12_PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your number: ");
        int base = scanner.nextInt();
        System.out.println("Print the power of the number: ");
        int exponent = scanner.nextInt();
           int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
    }

