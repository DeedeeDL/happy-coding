package org.example;

public class C01_07_MultipleVariables {
    public static void main(String[] args) {
        // a+ c, x + c,dx + x, ((int) dx) + ax, a + x, s + b, ax + b, s + c, ax + c.
        int a = 125;
        int b = 12345;
        long ax = 1234567890;
        short s = 4043;
        float x = 2.13459f;
        double dx = 1.1415927d;
        char c = 'W';
        System.out.println(a+c);
        System.out.println(x+c);
        System.out.println(dx+x);
        System.out.println(((int) dx) + ax);
        System.out.println(a+x);
        System.out.println(s+b);
        System.out.println(ax+b);
        System.out.println(s+c);
        System.out.println(ax+c);

    }
}
