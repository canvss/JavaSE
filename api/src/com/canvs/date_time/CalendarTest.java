package com.canvs.date_time;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 15:36
 */
public class CalendarTest {
    @Test
    public void test01(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR)+"-"+
                calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE)+
                " "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+
                ":"+calendar.get(Calendar.SECOND)); //2023-6-1 3:52:34;月份从0-11
    }
    @Test
    public void test02(){
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");  //设置时区
//        Calendar calendar = Calendar.getInstance(tz);
        Calendar calendar = new GregorianCalendar(tz);
        System.out.println(calendar.get(Calendar.YEAR)+"-"+
                calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE)+
                " "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+
                ":"+calendar.get(Calendar.SECOND)); //2023-6-1 0:49:14
    }

    @Test
    public void test03(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date); //Sat Jul 01 15:54:41 CST 2023
        calendar.setTime(new Date(1358196487047L));
        System.out.println(calendar.getTime()); //Tue Jan 15 04:48:07 CST 2013
        calendar.set(Calendar.DAY_OF_MONTH,8);
        System.out.println(calendar.getTime()); //Tue Jan 08 04:48:07 CST 2013
        calendar.add(Calendar.HOUR,10);
        System.out.println(calendar.getTime()); //Tue Jan 08 14:48:07 CST 2013
        calendar.add(Calendar.HOUR,-2);
        System.out.println(calendar.getTime()); //Tue Jan 08 12:48:07 CST 2013
    }
}

