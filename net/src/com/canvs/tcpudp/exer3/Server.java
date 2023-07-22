package com.canvs.tcpudp.exer3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 15:44
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            server = new ServerSocket(8888);
            System.out.println("等待客户端连接...");
            Socket accept = server.accept();
            InetAddress inetAddress = accept.getInetAddress();
            System.out.println(inetAddress.getHostAddress() + " 连接成功！");
            is = accept.getInputStream();

            byte[] buff = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(buff)) != -1) {
                sb.append(new String(buff, 0, len));
            }
            System.out.println(sb);
            os = accept.getOutputStream();
            os.write("【服务端】: 文件接收完毕！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
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
