package com.canvs.tcpudp.exer2;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 15:21
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            server = new ServerSocket(9999);
            System.out.println("等待客户端连接...");
            Socket accept = server.accept();
            InetAddress inetAddress = accept.getInetAddress();
            System.out.println(inetAddress.getHostAddress() + " 客户端连接成功");
            is = accept.getInputStream();
            fos = new FileOutputStream("周慧敏_copy.jpeg");
            byte[] buff = new byte[1024];
            int len;
            while ((len = is.read(buff)) != -1) {
                fos.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (server != null) server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
