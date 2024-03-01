package org.example;

import java.util.Scanner;

public class C03_08_OddNumbersAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input number of terms : ");
        int input = scanner.nextInt();

        System.out.println("The first " + input + " odd natural numbers are:");
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            int oddNumbers = 2 * i - 1;
            System.out.print(oddNumbers + " ");
            sum += oddNumbers;
        }
        System.out.println("\nThe sum of the first " + input + " odd natural numbers is: " + sum);

    }
}

