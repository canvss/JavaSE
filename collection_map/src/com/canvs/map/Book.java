package com.canvs.map;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 16:38
 */
public class Book implements Comparable{
    private String name;
    private double price;
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "书名='" + name + '\'' +
                ", 价格=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof Book){
            Book b = (Book)o;
            if (this.price == b.price) return this.name.compareTo(b.name);
            return (Double.compare(this.price, b.price));
        }
        throw new RuntimeException("类型有误！");
    }
}
