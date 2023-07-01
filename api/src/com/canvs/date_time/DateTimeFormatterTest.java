package com.canvs.date_time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 16:39
 */
public class DateTimeFormatterTest {
    @Test
    public void test01(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //日期转为字符串
        String str = dateTime.format(formatter);
        System.out.println(str);   //2023-07-01T16:43:02.455
        //字符串转为日期
        TemporalAccessor parse = formatter.parse(str);
        LocalDateTime dateTime1 = LocalDateTime.from(parse);
        System.out.println(dateTime1);  //2023-07-01T16:49:10.529
    }
    @Test
    public void test02(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //格式化
        String date = dateTime.format(formatter);
        System.out.println(date); //2023/07/01 16:53:36
        //解析
        TemporalAccessor parse = formatter.parse(date);
        dateTime = LocalDateTime.from(parse);
        System.out.println(dateTime);
    }
}
