package org.example;

public class P02_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        /*Write a C program to compute the perimeter and area of a circle with a given radius.
Expected Output:
Perimeter of the Circle = 37.680000 inches
Area of the Circle = 113.040001 square inches*/
        int radius = 20;
        double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println(" Perimeter of the Circle = " + perimeter + " inches");
        System.out.println(" Area of the Circle = " + area + " inches");
    }
}
