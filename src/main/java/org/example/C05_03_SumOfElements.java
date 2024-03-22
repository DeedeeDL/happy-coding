package org.example;

public class C05_03_SumOfElements {
    public static void main(String[] args) {
        int[] x = {2, 5, 9, 12};
        int sum = 0;
        for (int a : x) {
            sum = sum + a;
        }
        System.out.println("The sum of the elements from the array is: " + sum);
    }
}
