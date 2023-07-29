package com.canvs.grammar._switch;

import org.junit.Test;

import java.text.BreakIterator;
import java.time.Month;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 18:11
 */
public class SwitchTest {
    @Test
    public void test01() {
        int month = 1;
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            default:
                throw new RuntimeException("No such season!");
        }
    }
    @Test
    public void test02(){
        int month = 8;
        switch (month){
            case 1,2,3 -> System.out.println("春天");
            case 4,5,6 -> System.out.println("夏天");
            case 7,8,9 -> System.out.println("秋天");
            case 10,11,12 -> System.out.println("冬天");
            default -> throw new RuntimeException("No such season!");
        }
    }
    @Test
    public void test03(){
        String season = switch (7){
            case 1,2,3 -> "春天";
            case 4,5,6 -> "夏天";
            case 7,8,9 -> "秋天";
            case 10,11,12 -> "冬天";
            default -> throw new RuntimeException("No such season!");
        };
        System.out.println(season);
    }
    @Test
    public void test04(){
        String x = "3";
        int i;
        switch (x){
            case "1":
                i = 1;
                break;
            case "2":
                i = 1;
                break;
            default:
                i = x.length();
                break;
        }
        System.out.println(i);
    }
    @Test
    public void test05(){
        String x = "3";
        int i = switch (x){
            case "1" -> 1;
            case "2" -> 2;
            default -> {
                yield 3;
            }
        };
        System.out.println(i);
    }
    @Test
    public void test06(){
        String x = "3";
        int i = switch (x) {
            case "1":
                yield 1;
            case "2":
                yield 2;
            default:
                yield 3;
        };
        System.out.println(i);
    }
}
