package com.canvs.tcpudp.exer3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 15:44
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        ByteArrayOutputStream bao = null;
        try {
            socket = new Socket("127.0.0.1", 8888);
            InputStream is = socket.getInputStream();
            os = socket.getOutputStream();
            os.write("【客户端】: 我要开始发送文件了\n".getBytes());
            fis = new FileInputStream("Client.java");
            byte[] buff = new byte[1024];
            int len;
            while ((len = fis.read(buff)) != -1) {
                os.write(buff, 0, len);
            }
            os.write("\n【客户端】: 发送完成".getBytes());
            socket.shutdownOutput();
            System.out.println("【客户端】: 发送完毕！");
            bao = new ByteArrayOutputStream();
            while ((len = is.read(buff)) != -1) {
                bao.write(buff, 0, len);
            }
            System.out.println(bao);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bao != null) bao.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
