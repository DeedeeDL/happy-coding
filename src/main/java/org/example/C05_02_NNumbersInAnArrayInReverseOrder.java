package org.example;

import java.util.Scanner;

public class C05_02_NNumbersInAnArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int elt = scanner.nextInt();

        int[] array = new int[elt]; // this will create an array of size n

        // Read elements into the array :

        for (int i = 0; i < elt; i++) {
            System.out.println("Enter array element " + (i+1));
            array[i] = scanner.nextInt();

        }

        // Display elements in reverse order
        System.out.println("The elements in reverse order are:");
        for (int i = elt - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
