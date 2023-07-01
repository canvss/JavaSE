package com.canvs.date_time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 15:26
 */
public class DateTest {
    @Test
    public void test01(){
        Date now = new Date();
        System.out.println(now);    //Sat Jul 01 15:27:41 CST 2023
        System.out.println(now.getTime()); //获取当前时间戳
        Date dateTime = new Date(1358196487047L);
        System.out.println(dateTime); //Tue Jan 15 04:48:07 CST 2013
    }
    @Test
    public void test02(){
        long timemillis = System.currentTimeMillis();   //获取当前时间戳ms
        System.out.println(timemillis);
    }
    @Test
    public void test03() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(date);
        System.out.println(strDate);    //2023-07-01 15:33:49
        Date date1 = sdf.parse("2020-12-11 10:05:33");//解析文本日期
        System.out.println(date1);  //Fri Dec 11 10:05:33 CST 2020
    }
}
