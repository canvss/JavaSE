package com.canvs.basic.syntax;

public class OperatorDemo5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a + b;
        b += a;
        System.out.println(b);
        b -= a;
        System.out.println(b);
        int m = 1;
        m <<= 2;
        System.out.println(m);
    }
}
