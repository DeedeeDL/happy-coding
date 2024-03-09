package org.example;

import java.util.Scanner;

public class C03_16_SumOfNEvenNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int evenNumber = 2 * i;
            sum += evenNumber;
        }
        System.out.println("The sum of first " + n + " even natural numbers is: " + sum);

    }
}
