package org.example;

import java.util.Scanner;

public class C03_05_CubeOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
       

        for (int i = 1; i <= number; i++) {
            System.out.println("The cube of the number" + i + " is : " + i * i * i);
        }
    }
}
