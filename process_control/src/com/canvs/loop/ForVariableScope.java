package com.canvs.loop;

public class ForVariableScope {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++){
            num += i;
        }
        System.out.println(num);
    }
}
