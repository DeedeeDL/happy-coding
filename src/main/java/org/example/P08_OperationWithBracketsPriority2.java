package org.example;

public class P08_OperationWithBracketsPriority2 {
    public static void main(String[] args) {
        System.out.println(7+(3*5)*(4/2)+(5%3)-1);
        //The operations priority will be : opeations in brackets, *,/,%,+,-, so : 7+15*2+2-1 = 7+30+1= 38
    }
}
