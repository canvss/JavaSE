package com.canvs.encapsulation;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:01
 */
public class Book {
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String bookInfo(){
        return "书名："+bookName+"  作者："+author+"  出版社："+publisher+"  价格："+price;
    }
}
