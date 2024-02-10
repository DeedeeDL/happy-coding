package org.example;

import java.util.Scanner;
public class P12_CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI  * radius;
        System.out.println("The perimeter of the circle is : " + perimeter );
    }
}
