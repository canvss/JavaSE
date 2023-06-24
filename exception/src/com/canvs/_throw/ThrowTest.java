package com.canvs._throw;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 21:15
 */
public class ThrowTest {
    public static void main(String[] args) {
        try {
            System.out.println(max(7, 5, 2, 4, 9, 7));
            System.out.println(max());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static int max(int...nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("没有传入任何整数！");
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
