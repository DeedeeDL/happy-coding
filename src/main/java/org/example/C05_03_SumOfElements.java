package org.example;

public class C05_03_SumOfElements {

    public static int getSum(int[] x) {
        int sum = 0;
        for (int a : x) {
            sum = sum + a;
        }
        return sum;
    }
}
