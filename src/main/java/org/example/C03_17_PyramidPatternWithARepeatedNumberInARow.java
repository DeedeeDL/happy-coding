package org.example;

import java.util.Scanner;

public class C03_17_PyramidPatternWithARepeatedNumberInARow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of rows: ");
        int rows = scanner.nextInt();



        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ "   ");

            }
            System.out.println();

        }
    }
}

 /* for (int i = 1; i <= rows; i++) {
          for (int j = 1; j <= i; j++) {
          System.out.print(i + " ");
          }
          System.out.println();
          } */