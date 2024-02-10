package org.example;

import java.util.Scanner;

public class P15_sixNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter your second number : ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter your third number : ");
        int numberThree = scanner.nextInt();
        System.out.println("Enter your fourth number : ");
        int numberFour = scanner.nextInt();
        System.out.println("Enter your fifth number : ");
        int numberFive = scanner.nextInt();
        System.out.println("Enter your sixth number : ");
        int numberSix = scanner.nextInt();

        System.out.println("The average of your six numbers is: " + (numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix) / 6);
    }
}
