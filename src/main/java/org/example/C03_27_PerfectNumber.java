package org.example;

import java.util.Scanner;

public class C03_27_PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int sum = 0;

        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.println("A positive divisors is : " + i);
            }
        }

        System.out.println("The sum of the divisors is : " + sum);
        if (sum == number) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }
}
