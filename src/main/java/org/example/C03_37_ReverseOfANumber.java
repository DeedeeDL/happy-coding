package org.example;

import java.util.Scanner;

public class C03_37_ReverseOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("The reverse of the number is: " + reverse);

    }
}
