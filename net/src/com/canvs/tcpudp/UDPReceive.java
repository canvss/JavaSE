package com.canvs.tcpudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 21:13
 */
public class UDPReceive {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(9999);
            System.out.println("正在接收数据...");
            while (true){
                byte[] buff = new byte[1024*64];
                DatagramPacket dp = new DatagramPacket(buff,buff.length);
                ds.receive(dp);
                String data = new String(dp.getData(),0,dp.getLength());
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
