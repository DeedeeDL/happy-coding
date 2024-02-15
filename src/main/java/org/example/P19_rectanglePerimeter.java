package org.example;

import java.util.Scanner;

public class P19_rectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        System.out.println("The perimeter of the rectangle is : " + 2 * (width + height));
    }
}
