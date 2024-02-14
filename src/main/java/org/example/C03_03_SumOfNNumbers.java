package org.example;

public class C03_03_SumOfNNumbers {
    public static void main(String[] args) {
        int n = 7;
        int suma = 0;


        for (int i = 0; i <= n; i++) {
            suma = suma + i;

        }
        System.out.println("Suma numerelor este de: " + suma);
    }
}
