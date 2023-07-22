package com.canvs.tcpudp.chat;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 17:27
 */
public class ChatClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            Receive receive = new Receive(socket, "接收端：");
            receive.start();
            Send send = new Send(socket, "发送端：");
            send.start();
            send.join();    //等我发送线程结束了，才结束程序
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class Send extends Thread {
    private Socket socket;

    public Send(Socket socket, String name) {
        super(name);
        this.socket = socket;
    }
    @Override
    public void run() {
        BufferedReader input = null;
        PrintStream ps = null;
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(socket.getOutputStream());
            String message;
            while (true) {
                System.out.print("自己的话：");
                message = input.readLine();
                if ("bye".equals(message)) break;
                ps.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
            try {
                if (input != null) input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class Receive extends Thread {
    private Socket socket;
    public Receive(Socket socket, String name) {
        super(name);
        this.socket = socket;
    }
    @Override
    public void run() {
        Scanner input = null;
        try {
            InputStream is = socket.getInputStream();
            input = new Scanner(is);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) input.close();
        }
    }
}