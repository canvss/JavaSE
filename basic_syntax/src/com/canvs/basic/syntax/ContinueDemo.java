package com.canvs.basic.syntax;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int j=1 ; j<=5;j++){
                if (i == j){
//                    continue;
                    break;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
