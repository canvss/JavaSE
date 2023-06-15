package com.canvs.basic.syntax;

public class ConversionDemo {
    public static void main(String [] args){
        int i = 'A';
        double d = 10;
        byte b = 127;
        long num = 1234567;
        long bigNum = 12345678912L;
        int a = 1;
        int c = 2;
        //自动升级为double
        double sum = a+c;
        char c1 = 'A';
        char c2 = '2';
        System.out.println(c1+c2);
        System.out.println(i);
        System.out.println(b);
        System.out.println(num);
        System.out.println(bigNum);
        System.out.println(i+b);

        int t = (int)3.14;  //强制转换，损失精度
        System.out.println(t);
        int y = 200;
        byte sb =  (byte) y;    //溢出
        System.out.println(sb);

        int t1 = 10;
        int t2 = 3;
        double tSum = (double)t1/t2;
        System.out.println(tSum);
    }
}
