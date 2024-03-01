package org.example;
import java.util.Scanner;
public class C03_09_AsterixPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
