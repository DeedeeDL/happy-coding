package org.example;
import java.util.Scanner;
public class P07_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create the scanner object for an user input
        System.out.println("Enter your year:");
        int myYear = scanner.nextInt(); // create the variable myYear to write the own year
        scanner.close();

        // Using if we calculate if an year is a leap year or not (knowing that a year si a leap year - only if it is divided by 4,100 and 400 and if is divided by 4 and not 100

        if (myYear % 4 == 0) {
            if (myYear % 100 == 0) {
                if (myYear % 400 == 0) {
                    System.out.println(myYear + " is a leap year");
                } else {
                    System.out.println(myYear + " is not a leap year");
                }
            } else {
                System.out.println(myYear + " is a leap year");
            }
         }     else {
            System.out.println(myYear + " is not a leap year");
        }

        }
    }

