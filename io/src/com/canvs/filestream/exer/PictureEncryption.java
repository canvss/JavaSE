package com.canvs.filestream.exer;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 18:34
 */
public class PictureEncryption {
    public static void main(String[] args) throws FileNotFoundException {
//        encryption(new File("/Users/canvs/Desktop/JAVA/JavaSE/io/zhouhuiming.jpeg"));
            decryption(new File("encryption_zhouhuiming.jpeg"));
    }

    public static void encryption(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream("encryption_" + file.getName());
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                for (int i = 0; i < buffer.length; i++) buffer[i] ^= 5;
                fos.write(buffer, 0, len);
            }
            System.out.println("加密成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void decryption(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream("decryption_" + file.getName());
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                for (int i = 0; i < buffer.length; i++) buffer[i] ^= 5;
                fos.write(buffer,0,len);
            }
            System.out.println("解密成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
