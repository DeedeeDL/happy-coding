package org.example;
import java.util.Scanner;


public class P04_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your first number:" );
        int num1 = number.nextInt();
        System.out.println("Enter your second number:");
        int num2 = number.nextInt();
        System.out.println("The sum of the numbers is:" + (num1+num2));
      number.close();
    }
}
