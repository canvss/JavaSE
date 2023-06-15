package com.canvs.basic.syntax;

public class OperatorDemo3 {
    public static void main(String [] args){
        int a = 3;
        int b = 4;
        System.out.println(a>1 & a<5);  //true
        System.out.println(a>b | b>a);  //true
        System.out.println(a>2 ^ b>a);  //false
        System.out.println(!(a<5));     //false
        System.out.println(a<4 && b>a); //true
        System.out.println(a>5 || b>a); //true
    }
}
