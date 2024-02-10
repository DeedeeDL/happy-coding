package org.example;
import java.util.Scanner;
public class P05_EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // this will allow us to user input the number
        System.out.println("Enter your number:");
        int number = scanner.nextInt();  // I created a variable named num1
     // I will use if and else to see if the number is odd or even
        if ( number%2==0 ){
            System.out.println("The number " + number + " is an even number");
        }
        else {
            System.out.println("The number " + number + " is an odd number;");}



    }
}
