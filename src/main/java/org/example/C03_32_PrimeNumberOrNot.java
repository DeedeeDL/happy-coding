package org.example;

import java.util.Scanner;

public class C03_32_PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");

        int number = scanner.nextInt();
        boolean primenumber;

        if (number <= 1) {
            primenumber = false;
        } else {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    primenumber = false;

                }
            }
        }

        if (primenumber = true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
