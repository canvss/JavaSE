package com.canvs.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 22:05
 */
public class URLTest {
    public static void main(String[] args) {
        String str = "https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png?name=tom";
        URL url = null;
        try {
            url = new URL(str);
            System.out.println("协议："+url.getProtocol());
            System.out.println("主机名："+url.getHost());
            System.out.println("端口号："+url.getPort());
            System.out.println("文件路径："+url.getPath());
            System.out.println("文件名："+url.getFile());
            System.out.println("查询名："+url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
