package com.canvs.net;

import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 13:52
 */
public class InetAddressTest {
    @Test
    public void test01(){
        InetAddress ia = null;
        try {
            ia = InetAddress.getLocalHost();
            System.out.println(ia);
            System.out.println(ia.getHostName());
            System.out.println(ia.getHostAddress());
            System.out.println(ia.isReachable(5));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test02(){
        try {
            InetAddress ia = InetAddress.getByName("www.baidu.com");
            System.out.println(ia);
            System.out.println("IP地址："+ia.getHostAddress());
            System.out.println("域名："+ia.getHostName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test03(){
        try {
            byte[] addr = {112,54,108,98};
            InetAddress ia = InetAddress.getByAddress(addr);
            System.out.println(ia);
            System.out.println(ia.getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
