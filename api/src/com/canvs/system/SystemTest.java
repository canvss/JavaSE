package com.canvs.system;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 23:53
 */
public class SystemTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Java运行版本：" + System.getProperty("java.version"));
        System.out.println("Java安装目录：" + System.getProperty("java.home"));
        System.out.println("操作系统的名称："+ System.getProperty("os.name"));
        System.out.println("操作系统的版本："+ System.getProperty("os.version"));
        System.out.println("用户的账户名称："+System.getProperty("user.name"));
        System.out.println("用户的主目录："+System.getProperty("user.home"));
        System.out.println("用户的当前工作目录："+System.getProperty("user.dir"));
        System.gc();
        test();
        System.out.println("over!");    //不会执行
    }
    public static void test() throws InterruptedException {
        for (int i = 0; i < 10 ; i++) {
            SystemTest test = new SystemTest();
        }
        System.gc();
        Thread.sleep(5000);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "：被GC回收了!");
    }
}
