package com.canvs.method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 21:59
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        double[] length = new double[]{10,20,30};
        double[] winth = new double[]{5,15,25};
        for (int i = 0; i < 3; i++) {
            rectangle[i] = new Rectangle();
            rectangle[i].length = length[i];
            rectangle[i].width = winth[i];
        }
        new RectangleUtil().traversal(rectangle);
    }
}
class  RectangleUtil{
    public void traversal(Rectangle[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }
    }
}