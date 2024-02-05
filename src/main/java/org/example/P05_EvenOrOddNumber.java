package org.example;
import java.util.Scanner;
public class P05_EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);  // this will allow us to user input the number
        System.out.println("Enter your number:");
        int num1 = myNumber.nextInt();  // I created a variable named num1
     // I will use if and else to see if the number is odd or even
        if ( num1%2==0 ){
            System.out.println("The number " + num1 + " is an even number");
        }
        else {
            System.out.println("The number " + num1 + " is an odd number;");}



    }
}
