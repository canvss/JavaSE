package com.canvs.date_time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 16:24
 */
public class LocalDateTimeTest {
    @Test
    public void test01(){
        LocalDate date = LocalDate.now();
        System.out.println(date);   //2023-07-01
        date = LocalDate.of(2022,12,1);
        System.out.println(date);   //2022-12-01
    }
    @Test
    public void test02(){
        LocalTime time = LocalTime.now();
        System.out.println(time);   //16:26:28.343
        time = LocalTime.of(00,20,34);
        System.out.println(time);   //00:20:34
    }

    @Test
    public void test03(){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); //2023-07-01T16:27:14.465
        dateTime = LocalDateTime.of(2012,12,20,12,20,34);
        System.out.println(dateTime);   //2012-12-20T12:20:34
        System.out.println(dateTime.getYear()+"/"+dateTime.getMonthValue()+"/"+dateTime.getDayOfMonth());
        dateTime = dateTime.plusDays(10);
        System.out.println(dateTime);   //2012-12-30T12:20:34
    }
}
