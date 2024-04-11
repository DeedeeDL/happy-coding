package org.example;

import java.util.Scanner;

public class C05_05_TotalNumberOfDuplicatesInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int elements = scanner.nextInt();
        int[] array = new int[elements];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < elements; i++) {
            array[i] = scanner.nextInt();
        }

        // Count duplicates
        int duplicateTotal = 0;
        for (int i = 0; i < elements - 1; i++) {
            for (int j = i + 1; j < elements; j++) {
                if (array[i] == array[j]) {
                    duplicateTotal++;
                }
            }
        }

        System.out.println("Total number of duplicate elements: " + duplicateTotal);

    }
}