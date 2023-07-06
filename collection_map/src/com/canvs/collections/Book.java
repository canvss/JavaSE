package com.canvs.collections;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/6 21:24
 */
public class Book implements Comparable{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Book){
            return this.getName().equals(((Book) obj).getName()) && this.getPrice() == ((Book) obj).getPrice();
        }
        throw new RuntimeException("类型有误！");
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof Book){
            int value = this.getName().compareTo(((Book) o).getName());
            if (0 == value)
                return Double.compare(this.price,((Book) o).price);
            return value;
        }
        throw new RuntimeException("类型有误！");
    }
}
