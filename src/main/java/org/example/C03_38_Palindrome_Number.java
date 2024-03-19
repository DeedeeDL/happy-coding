package org.example;

import java.util.Scanner;

public class C03_38_Palindrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int orig_number = number;

        for (orig_number=number; number > 0; ){
            reverse=reverse*10+number%10;
            number = number/10;
        }
        if (orig_number == reverse){
        System.out.println(orig_number + " is a polindrome number");}
        else {
            System.out.println(orig_number + " is not a polindrome number");}

    }
}
