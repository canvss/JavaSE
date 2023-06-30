package com.canvs.string;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 19:40
 */
public class StringTest1 {
    String str = new String("good");
    char[] ch = {'g','o','o','d'};
    public void change(String str,char[] ch){
        str = "hello";
        ch[0] ='G';
    }
    public static void main(String[] args) {
        StringTest1 t = new StringTest1();
        t.change(t.str,t.ch);
        System.out.println(t.str);  //good
        for (int i = 0; i < t.ch.length; i++) { //Good
            System.out.print(t.ch[i]+"\t");
        }
    }
}
