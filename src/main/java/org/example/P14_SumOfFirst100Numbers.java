package org.example;


public class P14_SumOfFirst100Numbers {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("The sum of the first 100 numbers is: " + sum);

    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
