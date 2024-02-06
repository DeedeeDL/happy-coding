package org.example;
import java.util.Scanner;

public class P10_AreaOFACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // I declared the object scanner to facilitate the user to input its value;
        System.out.println("Enter the radius of the circle:");
        double cerc = scanner.nextDouble();  // I declared a double variable where the user input whatever value with decimals for the circle radius.
        double area = 3.14 *cerc*cerc; // I declared a variable where the value represents the formula of circle area (pi*R2, where pi=3.14)
        System.out.println("The area of the circle is: " + area );

    }
}
