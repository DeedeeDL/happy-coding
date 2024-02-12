package org.example;

import java.util.Scanner;

public class P29_SquareOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();
        scanner.close();
        int square = num * num;
        System.out.println("The square of your number is: " + square);
    }
}
