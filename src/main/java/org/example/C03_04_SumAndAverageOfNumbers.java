package org.example;

import java.util.Scanner;

public class C03_04_SumAndAverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 10 numbers: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        double average = sum / 10;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("the average of the numbers: " + average);


    }
}
