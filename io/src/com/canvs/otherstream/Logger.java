package com.canvs.otherstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 23:06
 */
public class Logger {
    public static void log(String msg) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream("log.txt", true));
            System.setOut(ps);
            Date nowTim = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String time = sdf.format(nowTim);
            System.out.println(time + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
        }
    }
    public static void main(String[] args) {
        log("登录了系统");
        log("修改了状态");
        log("退出了系统");
    }
}
