package org.example;

public class C05_04_Copy_Array {
    public static void main(String[] args) {
        int[] elements1 = new int[]{1, 9, 8, 9};
        //Create another array arr2 with size of arr1
        int elements2[] = new int[elements1.length];
        //Copying all elements of one array into another
        for (int i = 0; i < elements1.length; i++) {
            elements2[i] = elements1[i];
        }

        System.out.println("Elements of original array: ");
        for (int i = 0; i < elements1.length; i++) {
            System.out.print(elements1[i] + " ");
        }

        System.out.println();

        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < elements2.length; i++) {
            System.out.print(elements2[i] + " ");
        }
    }
}