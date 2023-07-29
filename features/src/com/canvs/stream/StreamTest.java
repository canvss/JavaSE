package com.canvs.stream;

import org.junit.Test;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 15:02
 */
public class StreamTest {
    @Test
    public void test01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = list.stream();
        Stream<Integer> integerStream = list.parallelStream();
    }

    @Test
    public void test02() {
        String[] str = {"Tom", "Jack", "Jerry", "Canvs"};
        Stream<String> stream = Arrays.stream(str);
        int[] arr = {1, 2, 3, 4, 5, 6};
        IntStream stream1 = Arrays.stream(arr);
    }

    @Test
    public void test03() {
        Stream<String> stream = Stream.of("canvs", "Tom", "jack", "jerry");
        stream.forEach(System.out::println);
    }

    @Test
    public void test04() {
        Stream<Integer> iterate = Stream.iterate(0, x -> x + 2);
        iterate.limit(10).forEach(System.out::println);
    }
    @Test
    public void test05(){
        Stream<Double> stream = Stream.generate(Math::random);
        stream.limit(10).forEach(System.out::println);
    }
}
