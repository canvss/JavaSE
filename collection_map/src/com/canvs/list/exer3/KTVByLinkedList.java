package com.canvs.list.exer3;

import java.net.SocketTimeoutException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 11:25
 */
public class KTVByLinkedList {
    static List list = new LinkedList();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        addMusic(list);
        l:while (true){
            System.out.println(list);
            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");

            System.out.print("请选择：");
            int num = scan.nextInt();
            switch (num){
                case 1:
                    addMusic();
                    break;
                case 2:
                    topMusic();
                    break;
                case 3:
                    setBefore();
                    break;
                case 4:
                    System.out.println("----------------退出---------------");
                    System.out.println("您已退出系统");
                    break l;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("选择错误！");
                    break;
            }
        }
        scan.close();
    }
    public static void addMusic(){
        System.out.println("请输入歌曲:");
        String musicName = scan.next();
        list.add(musicName);
        System.out.println(musicName +" 添加成功");
    }
    public static void topMusic(){
        System.out.println("输入置顶歌曲:");
        String musicName = scan.next();
        int index = list.indexOf(musicName);
        if (index==0){
            System.out.println(musicName+" 已置顶");
        }else if (index < 0) {
            System.out.println("歌曲不存在");
        }else{
            list.remove(musicName);
            list.add(0,musicName);
            System.out.println(musicName+" 已添加置顶");
        }
    }
    public static void setBefore(){
        System.out.println("请输入歌曲:");
        String musicName = scan.next();
        int index = list.indexOf(musicName);
        if (index < 0){
            System.out.println("当前列表没有次歌曲");
        }else if(index == 0){
            System.out.println("歌曲已经置顶");
        }else {
            list.remove(musicName);
            list.add(index-1,musicName);
            System.out.println(musicName+"向前移一位");
        }
    }
    public static void addMusic(List list){
        list.add("一千个伤心的理由");
        list.add("遥远的她");
        list.add("只想一生跟你走");
        list.add("你瞒我瞒");
    }
}
