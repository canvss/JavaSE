package com.canvs.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 21:01
 */
public class UDPTest {
    @Test
    public void test01() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            byte[] buff = "hello world!".getBytes();
            DatagramPacket dp = new DatagramPacket(buff, 0, buff.length,
                    InetAddress.getByName("127.0.0.1"), 9000);
            ds.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ds != null) ds.close();
        }
    }
    @Test
    public void test02() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9000);
            byte[] buff = new byte[1024 * 64];
            DatagramPacket dp = new DatagramPacket(buff, buff.length);
            ds.receive(dp);
            String message = new String(dp.getData(), 0, dp.getLength());
            System.out.println(dp.getAddress().getHostAddress()+":"+message);    //hello world!
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ds != null) ds.close();
        }
    }
}
