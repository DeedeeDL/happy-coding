package org.example;

import java.util.Scanner;

public class DivisibleBy3Or7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 || number % 7 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
}
