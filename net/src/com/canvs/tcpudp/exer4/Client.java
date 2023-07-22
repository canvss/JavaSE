package com.canvs.tcpudp.exer4;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 16:53
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader input = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            input = new BufferedReader(isr);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message;
            while (true) {
                System.out.print("请输入：");
                message = input.readLine();
                if (message.equals("bye")) break;
                ps.println(message);
                ps.flush();
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) input.close();
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
