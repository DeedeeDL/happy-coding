package org.example;

import java.util.Scanner;

public class C01_10_ProductOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The product of your numbers is: " + (num1 * num2));
    }
}
