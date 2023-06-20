package com.canvs._polymorphism.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 23:06
 */
public class GeometricTest {
    public Boolean equalsArea(GeometricObject i,GeometricObject j){
        if(i.findArea() == j.findArea()){
            return true;
        }
        return false;
    }
    public void displayGeometricObject(GeometricObject obj){
        System.out.println("面积="+obj.findArea());
    }

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        GeometricObject c1 = new Circle(2.1,"red",1);
        Rectangle r1 = new Rectangle(2,2.1,"white",2);
        test.displayGeometricObject(c1);
        System.out.println(test.equalsArea(c1, r1));
        test.displayGeometricObject(r1);
    }
}
