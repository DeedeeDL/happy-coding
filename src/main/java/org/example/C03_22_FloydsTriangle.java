package org.example;

import java.util.Scanner;

public class C03_22_FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int number;
    
        for (int i=1; i<=rows;i++)
        {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();

        }
    }
}