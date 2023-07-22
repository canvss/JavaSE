package com.canvs.tcpudp.exer;

import com.sun.deploy.trace.SocketTraceListener;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 15:01
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket socket = null;
        InputStream inputStream = null;
        try {
            //创建ServerSocket对象，并绑定端口为9999
            socket = new ServerSocket(9999);
            System.out.println("等待客户端连接...");
            //进入阻塞状态，在9999端口监听客户端的连接
            Socket accept = socket.accept();
            InetAddress inetAddress = accept.getInetAddress();
            System.out.println(inetAddress.getHostAddress()+" 客户端连接成功");
            //获取输入流，用来接受客户端发送给服务器的数据
            inputStream = accept.getInputStream();
            byte[] buff = new byte[1024];
            int len;
            while ((len = inputStream.read(buff)) != -1) {
                String data = new String(buff, 0, len);
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输入流资源
                if (inputStream != null) inputStream.close();
                //关闭socket资源
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
