package com.canvs.tcpudp.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 17:26
 */
public class ChatServer {
    static ArrayList<Socket> online = new ArrayList<>();

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(9999);
            int count = 1;
            while (true) {
                Socket accept = server.accept();
                online.add(accept);
                MessageHandler mh = new MessageHandler(accept, "客户端" + count++);
                mh.start();
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

    static class MessageHandler extends Thread {
        private Socket socket;
        private String ip;

        public MessageHandler(Socket socket, String name) {
            super(name);
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                ip = socket.getInetAddress().getHostAddress();
                sendToOther(ip + " 上线了");
                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String message;
                while ((message = br.readLine()) != null) {
                    sendToOther(ip + ":" + message);
                }
                sendToOther(ip + "下线了");
            } catch (IOException e) {
                try {
                    sendToOther(ip + "掉线了");
                } catch (IOException ex) {
                    e.printStackTrace();
                }
            } finally {
                online.remove(socket);
            }
        }
    }
    public static void sendToOther(String message) throws IOException {
        for (Socket on : online) {
            PrintStream ps = new PrintStream(on.getOutputStream());
            ps.println(message);
        }
    }
}
