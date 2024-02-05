package org.example;
import java.util.Scanner;

public class P06_MultiplicationTable {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = number.nextInt();
        number.close();

        for (int i = 0; i <= 100; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));

        }
    }
}
