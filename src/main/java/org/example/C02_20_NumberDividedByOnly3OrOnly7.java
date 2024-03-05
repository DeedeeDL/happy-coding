package org.example;

import java.util.Scanner;

public class C02_20_NumberDividedByOnly3OrOnly7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 7 == 0) {
            System.out.println(false);
        } else if (number % 3 == 0 || number % 7 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
