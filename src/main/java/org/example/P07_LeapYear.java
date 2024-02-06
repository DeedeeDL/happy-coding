package org.example;
import java.util.Scanner;
public class P07_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year:");
        int myYear = scanner.nextInt();
        scanner.close();

        if(myYear%4 == 0 && myYear % 100 ==0 && myYear%400 == 0) {
            System.out.println(myYear + " is a leap year");
        }
        else {
            System.out.println(myYear + " is not a leap year");}
    }
}
