package org.example;

import java.util.Scanner;

public class P17_rectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        System.out.println("The area of the rectangle is: " + width * height);

    }
}
