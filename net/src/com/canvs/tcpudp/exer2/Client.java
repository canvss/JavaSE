package com.canvs.tcpudp.exer2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 15:21
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream os = null;
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            socket = new Socket(address,port);
            fis = new FileInputStream(new File("/Users/canvs/Desktop/周慧敏.jpeg"));
            os = socket.getOutputStream();
            byte[] buff = new byte[1024];
            int len;
            while ((len = fis.read(buff)) != -1) {
                os.write(buff, 0, len);
            }
            System.out.println("发送完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
