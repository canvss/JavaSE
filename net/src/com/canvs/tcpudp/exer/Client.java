package com.canvs.tcpudp.exer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 15:06
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            //准备Socket，连接服务器需要指定服务器的IP地址和端口号
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            socket = new Socket(address,port);
            //获取输出流，用来发送数据给服务器
            os = socket.getOutputStream();
            //发送数据
            os.write("hello world!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输出流
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                //关闭socket
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
