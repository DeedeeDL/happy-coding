package org.example;

public class P16_SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<=10;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(" The sum of the even numbers from 0 to 10 is:" + sum );
    }
}
