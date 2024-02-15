package org.example;

public class C03_02_SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i=0; i<=10; i++){
            sum = sum + i;
        }
        System.out.println("Suma primelor 10 numere este: " + sum);
    }
}
