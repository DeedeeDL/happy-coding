package org.example;

import java.util.Scanner;

public class C03_15_TheFactorialOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter he number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}