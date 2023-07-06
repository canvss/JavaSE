package com.canvs.collections;

import org.junit.Test;
import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/6 21:19
 */
public class CollectionsTest {
    @Test
    public void testReberse() {
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Collections.reverse(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    @Test
    public void testShuffle() {
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Collections.shuffle(list);
        for (Object o : list) System.out.println(o);
    }

    @Test
    public void testSort() {
        List list = new ArrayList();
        list.add(new Book("Java编程思想", 76.5));
        list.add(new Book("鸟哥Linux私房菜", 98));
        list.add(new Book("算法第四版", 69.4));
        list.add(new Book("深入理解Java虚拟机", 85.1));
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void testSort2(){
        List list = new ArrayList();
        list.add(new Book("Java编程思想", 76.5));
        list.add(new Book("鸟哥Linux私房菜", 98));
        list.add(new Book("算法第四版", 69.4));
        list.add(new Book("深入理解Java虚拟机", 85.1));
        System.out.println(list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) return 0;
                if (o1 instanceof Book && o2 instanceof Book){
                    Book b1 = (Book) o1;
                    Book b2 = (Book) o2;
                    int value = Double.compare(b1.getPrice(), b2.getPrice());
                    if (value == 0){
                        return b1.getName().compareTo(b2.getName());
                    }
                    return value;
                }
                throw new RuntimeException("类型有误！");
            }
        });
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
    @Test
    public void testSwap(){
        List list = new ArrayList();
        list.add(new Book("Java编程思想", 76.5));
        list.add(new Book("鸟哥Linux私房菜", 98));
        list.add(new Book("算法第四版", 69.4));
        list.add(new Book("深入理解Java虚拟机", 85.1));
        System.out.println(list);
        Collections.swap(list,2,3);
        System.out.println(list);
    }
    @Test
    public void testMax(){
        List list = Arrays.asList("G", "A", "H", "C", "R", "Q", "I");
        System.out.println(Collections.max(list));
        Object max = Collections.max(list, new Comparator() {
            //定制排序取出最小的值
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s2.compareTo(s1);
            }
        });
        System.out.println(max);
    }
}
