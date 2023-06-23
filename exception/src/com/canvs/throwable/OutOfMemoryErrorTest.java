package com.canvs.throwable;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 22:15
 */
public class OutOfMemoryErrorTest {
    @Test
    public void test(){
        //OutOfMemoryError
        int [] i = new int[Integer.MAX_VALUE];
    }
    @Test
    public void test1(){
        //OutOfMemoryError
        StringBuffer sb  = new StringBuffer();
        while(true){
            sb.append("hello");
        }
    }
}
