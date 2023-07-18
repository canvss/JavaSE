package com.canvs.otherstream;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 22:31
 */
public class MyInput {
    public static String readString(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }
    public static int readInt(){
        return Integer.parseInt(readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }
    public static float readFloat(){
        return Float.parseFloat(readString());
    }
    public static boolean readBoolean(){
        return Boolean.parseBoolean(readString());
    }
    public static short readShort(){
        return Short.parseShort(readString());
    }
}
