package com.canvs.string;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 19:51
 */
public class StringAPITest {
    @Test
    public void test01() throws Exception{
        String s1 = new String("hello");
        String s2 = new String(s1);
        System.out.println(s2==s1); //false
        char[] s3 = {'h','e','l','l','o'};
        String s4 = new String(s3);
        System.out.println(s4); //hello
        byte[] b = {65,66,67};
        System.out.println(new String(b));  //ABC
        String s5 = new String(b,"utf-8");
    }
    @Test
    public void test02(){
        String s1 = "helloworld";
        char[] ch = s1.toCharArray();
        String s2 = "ABC";
        byte[] b = s2.getBytes();
        String s3 = "456";
        int i = Integer.parseInt(s3);
        double d =45.3;
        String s4 = String.valueOf(d);
    }
    @Test
    public void test03(){
        String s1 = "helloworld";
        System.out.println(s1.isEmpty());   //false
        System.out.println("".isEmpty());   //true
        System.out.println(s1.length());   //10
        String s2 = s1.concat("!!!");
        System.out.println(s2); //helloworld!!!
        String s3 = "HELLOWORLD";
        System.out.println(s1.equals(s3));  //false
        System.out.println(s1.equalsIgnoreCase(s3)); //true
        System.out.println("A".compareTo("a")); //-32
        System.out.println("A".compareToIgnoreCase("a")); //0
        System.out.println("abcd".toUpperCase());   //ABCD
        System.out.println("EFG".toLowerCase());    //efg
        System.out.println("    a b    ".trim());
        String str = "你好";
        String str1 = str.intern();
        System.out.println(str == str1);    //true
    }
    @Test
    public void test04(){
        String s1 = "helloworldhello";
        System.out.println(s1.contains("wor")); //true
        System.out.println(s1.indexOf("ll"));    //2
        System.out.println(s1.indexOf("ll",7)); //12
        System.out.println(s1.lastIndexOf("ld"));   //8
        System.out.println(s1.lastIndexOf("ll",10)); //2
    }

    @Test
    public void test05(){
        String s1 = "helloworld";
        System.out.println(s1.substring(7));    //rld
        System.out.println(s1.substring(3,6));  //low
        String s2 = "hello.java";
        System.out.println("文件后缀名："+s2.substring(s2.lastIndexOf("."))); //.java
        System.out.println("文件名："+s2.substring(0,s2.lastIndexOf("."))); //hello
    }
    @Test
    public void test06(){
        String s1 = "helloworld";
        System.out.println(s1.charAt(2));   //l
        char[] ch = s1.toCharArray();
        char[] ch2 = {'l','o','w'};
        String s2 = String.valueOf(ch2);
        String s3 = String.copyValueOf(ch);
    }
    @Test
    public void test07(){
        String s1 = "helloworld";
        System.out.println(s1.startsWith("h")); //true
        System.out.println(s1.endsWith("d"));   //true
        System.out.println(s1.startsWith("w",5));   //true
    }

    @Test
    public void test08(){
        String s1 = "helloworld";
        String s2 = s1.replace("world","世界");
        System.out.println(s2); //hello世界
        String str1 = "hello244world.java;887";
        //把其中的非字母去掉
        str1 = str1.replaceAll("[^a-zA-Z]", "");
        System.out.println(str1);
        String str2 = "12hello34world5java7891mysql456";
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String string = str2.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);
    }
}
