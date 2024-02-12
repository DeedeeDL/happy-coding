package org.example;

import java.util.Scanner;

public class P30_cubeOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        double number = scanner.nextDouble();
        double cube = number * number * number;
        System.out.println("The cube of your number is: " + cube);
    }
}
