package com.canvs.encapsulation;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:05
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("JAVA编程思想");
        book.setAuthor("Bruce Eckel");
        book.setPrice(80);
        book.setPublisher("机械工业出版社");
        System.out.println(book.bookInfo());    //书名：JAVA编程思想  作者：Bruce Eckel  出版社：机械工业出版社  价格：80.0
    }
}
