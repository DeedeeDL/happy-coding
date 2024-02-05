package org.example;
/* what is the output for System.out.println((2+3)4)*/
public class P02_OperationsWithBraketsPriority {
    public static void main(String[] args) {
        int calcul = (2+3)*4;
        System.out.println(calcul);
        /* the output will be 20 because we calculate first the addition because it is between brakets, and after that we multiplicate the result with 4 */


    }
}
