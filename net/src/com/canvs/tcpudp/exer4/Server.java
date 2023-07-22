package com.canvs.tcpudp.exer4;

import javax.naming.Name;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 16:25
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        int count = 1;
        try {
            server = new ServerSocket(9999);
            System.out.println("等待连接中...");
            while (true) {
                Socket socket = server.accept();
                ClientHandlerThread thread = new ClientHandlerThread("客户端" + count++, socket);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (server != null) server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class ClientHandlerThread extends Thread {
        private Socket socket;

        public ClientHandlerThread(String name, Socket socket) {
            super(name);
            this.socket = socket;
        }

        @Override
        public void run() {
            PrintStream ps = null;
            try {
                System.out.println(Thread.currentThread().getName() + "连接成功！");
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                OutputStream os = socket.getOutputStream();
                ps = new PrintStream(os);
                String data;
                while ((data = br.readLine()) != null) {
                    StringBuilder sb = new StringBuilder(data);
                    sb.reverse();
                    ps.println("【服务端】：" + sb);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if (ps != null) ps.close();
            }
        }
    }
}
