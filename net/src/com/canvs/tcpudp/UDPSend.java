package com.canvs.tcpudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 21:12
 */
public class UDPSend {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            Scanner input = new Scanner(System.in);
            String data;
            while (true) {
                System.out.print("输入发送的数据：");
                data = input.nextLine();
                if ("bye".equals(data)) break;
                byte[] buff = data.getBytes();
                DatagramPacket dp = new DatagramPacket(buff, 0, buff.length, InetAddress.getByName("127.0.0.1"), 9999);
                ds.send(dp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ds != null) ds.close();
        }
    }
}
