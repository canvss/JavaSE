package com.canvs.date_time;

import org.junit.Test;

import java.time.Instant;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 16:37
 */
public class InstantTest {
    @Test
    public void test01(){
        Instant instant = Instant.now();
        System.out.println(instant);    //2023-07-01T08:37:55.788Z
    }
}
