package com.canvs.api.optional;

import org.junit.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/30 10:46
 */
public class OptionalTest {
    @Test
    public void test01(){
        String star = "迪丽热巴";
//        star = null;
//        System.out.println(star.equals("hello"));   //NullPointerException
        //创建一个Optjonal实例，value可能是空，也可能非空
        Optional<String> star1 = Optional.ofNullable(star);
        //如果Optional实例内部value属性非空，则返回value，否则返回other
        String finalStart = star1.orElse("杨幂");
        System.out.println(finalStart); //迪丽热巴
    }
    @Test
    public void test02(){
        String star = "迪丽热巴";
        Optional<String> star1 = Optional.ofNullable(star);
        System.out.println(star1.get());    //迪丽热巴
    }
    @Test
    public void test03(){
        String str = "hello";
        Optional<String> str1 = Optional.of(str);
        System.out.println(str1.get()); //hello
    }
    @Test
    public void test04(){
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
//        System.out.println(empty.get());  //NoSuchElementException
    }
    @Test
    public void test05(){
        String str = null;
        Optional<String> str1 = Optional.ofNullable(str);
        System.out.println(str1);
        //System.out.println(str1.get()); //NoSuchElementException
    }
    @Test
    public void test06(){
        String str = null;
        Optional<String> str1 = Optional.ofNullable(str);
        String s = str1.orElseGet(String::new);
        System.out.println(s);
    }
    @Test
    public void test07(){
        String str = null;
        Optional<String> str1 = Optional.ofNullable(str);
        String s = str1.orElseThrow(() -> new RuntimeException("值不存在"));
        System.out.println(s);  //java.lang.RuntimeException: 值不存在
    }
    @Test
    public void test08(){
        String str = "Hello";
        Optional<String> str1 = Optional.ofNullable(str);
        //判断是否为纯字母，如果是转为大写，否则保持不变
        String s1 = str1.filter(s -> s.matches("[a-zA-Z]+")).map(s -> s.toUpperCase()).orElse(str);
        System.out.println(s1);
    }
    @Test
    public void test09(){
        String str = null;
        Optional<String> str1 = Optional.ofNullable(str);
        System.out.println(str1.isEmpty()); //true
    }
}
