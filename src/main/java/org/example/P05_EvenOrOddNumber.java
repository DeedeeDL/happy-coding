package org.example;
import java.util.Scanner;
public class P05_EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num1 = myNumber.nextInt();

        if ( num1%2==0 ){
            System.out.println("The number " + num1 + " is even");
        }
        else {
            System.out.println("The number " + num1 + " is odd;");}



    }
}
