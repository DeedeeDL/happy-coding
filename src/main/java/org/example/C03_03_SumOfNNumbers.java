package org.example;

public class C03_03_SumOfNNumbers {
    public static void main(String[] args) {
        int n = 7;
        int sum = 0;


        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("Suma numerelor este de: " + sum);
    }
}
