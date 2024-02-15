package org.example;
import java.util.Scanner;

public class P11_QuotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int dividend = scanner.nextInt();
        System.out.println("Enter your divizor: ");
       int divizor = scanner.nextInt();

        System.out.println("Quotient is: " + (dividend/divizor));
        System.out.println("Reminder is: " + (dividend%divizor));
    }
}
