package com.canvs.selfdefine;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 20:29
 */
public class Father <T1,T2>{
}
//子类不保留父类泛型
//没有类型 擦除
class Son1 extends Father{
}
class Son2<A,B> extends Father{
}
//具体类型
class Son3 extends Father<Integer,String>{
}
class Son4<A,B> extends Father<Integer,String>{
}
//子类保留父类的泛型
//部分保留
class Son5<T2> extends Father<Integer,T2>{
}
class Son6<A,B,T2> extends Father<Integer,T2>{
}
//全部保留
class Son7<T1,T2> extends Father<T1,T2>{
}
class Son8<A,B,T1,T2> extends Father<T1,T2>{
}