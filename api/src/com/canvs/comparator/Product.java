package com.canvs.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 21:46
 */
public class Product implements Comparable{
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o==this) return 0;
        if (o instanceof Product){
            if (this.price>((Product) o).price) return 1;
            if (this.price<((Product) o).price) return -1;
            return this.name.compareTo(((Product) o).name);
        }
        throw new RuntimeException("类型有误！");
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("iphon14pro",5999);
        products[1] = new Product("xiaomi",3999);
        products[2] = new Product("huawei",3999);
        products[3] = new Product("redmi",1999);
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1==o2) return 0;
                if (o1 != null && o2 != null){
                    if (o1.price > o2.price) return 1;
                    if (o1.price < o2.price) return -1;
                    return o1.name.compareTo(o2.name);
                }
                throw new RuntimeException("类型有误！");
            }
        });
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
