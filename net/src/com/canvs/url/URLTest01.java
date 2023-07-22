package com.canvs.url;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/22 22:10
 */
public class URLTest01 {
    @Test
    public void test01() {
        InputStream is = null;
        FileOutputStream fos = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
            urlConnection = (HttpURLConnection) url.openConnection();
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("dest.jpg");
            byte[] buff = new byte[1024];
            int len;
            while ((len = is.read(buff)) != -1) {
                fos.write(buff, 0, len);
            }
            System.out.println("文件下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (urlConnection != null) urlConnection.disconnect();
        }
    }
}
