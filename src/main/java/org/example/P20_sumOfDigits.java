package org.example;

import java.util.Scanner;

public class P20_sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");/ 2314
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            int rest = number % 10;
            sum = sum + rest;
            number = number / 10;
        }
        System.out.println("The sum of the digits of the number is: " + sum);
    }
}
