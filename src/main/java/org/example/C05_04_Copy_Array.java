package org.example;

public class C05_04_Copy_Array {
    public static void main(String[] args) {
        int[] originalArray = new int[]{1, 9, 8, 9};

        int[] newArray = new int[originalArray.length];
        //Copying all elements of one array into another
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        System.out.println("Elements of original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println();

        System.out.println("Elements of new array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}