package org.example;

public class p18_swapTwoNumbers {
    public static void main(String[] args) {
        int numOne = 2;
        int numTwo = 3;
        int toSwap;

        toSwap = numOne;
        numOne=numTwo;
        numTwo = toSwap;

        System.out.println("The value of numOne is: " + numOne);
        System.out.println("The value of numTwo is: " + numTwo);
    }
}
