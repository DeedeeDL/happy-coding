package org.example;
import java.util.Scanner;

public class NumberDividedByOnly3OrOnly7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= 100; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));

        }
    }
}
