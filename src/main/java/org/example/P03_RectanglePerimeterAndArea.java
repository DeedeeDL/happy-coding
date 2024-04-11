package org.example;
/* Write a C program to compute the perimeter and area of a rectangle with a
height of 7 inches and width of 5 inches.
Expected Output:
Perimeter of the rectangle = 24 inches
Area of the rectangle = 35 square inches */
public class P03_RectanglePerimeterAndArea {
    public static void main(String[] args) {
    
        int height = 7;
        int width = 5;
        int perimeter = (height + width) * 2;
        int area = height * width;

        System.out.println("Perimeter of the rectangle = " + perimeter + " inches");
        System.out.println("Area of the rectangle = " + area + " inches");
    }
}
