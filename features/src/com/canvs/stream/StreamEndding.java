package com.canvs.stream;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 16:32
 */
public class StreamEndding {
    @Test
    public void test01() {
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);
    }

    @Test
    public void test02() {
        long count = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println(count);
    }

    @Test
    public void test03() {
        boolean result = Stream.of(1, 3, 5, 7, 9, 10).allMatch(t -> t % 2 == 0);
        System.out.println(result); //false
    }

    @Test
    public void test04() {
        boolean result = Stream.of(1, 3, 5, 7, 9, 10).anyMatch(t -> t % 2 == 0);
        System.out.println(result); //true
    }

    @Test
    public void test05() {
        Optional<Integer> first = Stream.of(1, 3, 5, 7, 9, 10).findFirst();
        System.out.println(first);
    }

    @Test
    public void test06() {
        Optional<Integer> any = Stream.of(1, 3, 5, 7, 9, 10).findAny();
        System.out.println(any);
    }

    @Test
    public void test07() {
        Optional<Integer> first = Stream.of(1, 3, 5, 7, 9, 10).filter(t -> t % 3 == 0).findFirst();
        System.out.println(first);
    }

    @Test
    public void test08() {
        Optional<Integer> first = Stream.of(1, 2, 4, 5, 7, 8).filter(t -> t % 3 == 0).findFirst();
        System.out.println(first);  //Optional.empty
    }

    @Test
    public void test09() {
        Optional<Integer> max = Stream.of(1, 2, 4, 5, 7, 8).max(Integer::compare);
        System.out.println(max);    //Optional[8]
    }

    @Test
    public void test10() {
        Integer reduce = Stream.of(1, 2, 4, 5, 7, 8).reduce(0, (t1, t2) -> t1 + t2);
        System.out.println(reduce); //27
    }

    @Test
    public void test11() {
        Optional<Integer> reduce = Stream.of(1, 2, 4, 5, 7, 8).reduce((t1, t2) -> t1 + t2);
        System.out.println(reduce);//Optional[27]
    }

    @Test
    public void test12() {
        List<Integer> collect = Stream.of(1, 2, 4, 5, 7, 8).filter(t -> t % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
