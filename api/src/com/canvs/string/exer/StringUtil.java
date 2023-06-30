package com.canvs.string.exer;

import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 20:50
 */
public class StringUtil {
    //取消字符串所有空格
    public static String trimOfAll(String str){
        String s = "";
        if (str != null){
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i,i+1).equals(" ")){
                    continue;
                }else {
                    s += str.substring(i,i+1);
                }
            }
        }
        return s;
    }
    //去掉字符串两端空格
    public static String trim(String str){
        int start = 0;
        int end =0;
        if (str != null){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' '){
                    continue;
                }else {
                    start = i;
                    break;
                }
            }
            for (int i = str.length()-1; i >= 0; i--) {
                if (str.charAt(i) == ' '){
                    continue;
                }else {
                    end = i;
                    break;
                }
            }
        }
        return str.substring(start,end+1);
    }
    public static String trim2(String str){
        if (str != null){
            int start = 0;
            int end = str.length()-1;
            while (start < end && str.charAt(start) == ' '){
                start++;
            }
            while (end > start && str.charAt(end) == ' '){
                end--;
            }
            return str.substring(start,end+1);
        }
        return null;
    }
    //指定范围字符串的反转
    public static String reversel(String str,int start,int end){
        if (str != null){
            char[] charArray = str.toCharArray();
            for (int i = start,j=end; i < j; i++,j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            return new String(charArray);
        }
        return null;
    }
    public static String reversel2(String str,int start,int end){
        if (str!=null){
            String newStr = str.substring(0,start);
            for (int i = end; i >= start; i--) {
                newStr += str.charAt(i);
            }
            return new String(newStr+str.substring(end+1));
        }
        return null;
    }
    public static String reversel3(String str,int start,int end){
        if (str!=null){
            StringBuffer sb = new StringBuffer(str.length());
            sb.append(str.substring(0,start));
            for (int i = end; i >= start; i--) {
                sb.append(str.charAt(i));
            }
            return sb.append(str.substring(end+1)).toString();
        }
        return null;
    }
    //获取一个字符串在另一个字符串中出现的次数
    public static int getCount(String str,String subStr){
        if (str.equals(subStr)){
            return 0;
        }
        int count = 0;
        if (str.length()>=subStr.length()){
            int index = 0;
            for (int i = index; i < str.length(); i++) {
                if (str.indexOf(subStr,index) != -1){
                    index = str.indexOf(subStr,index)+subStr.length();
                    count++;
                }else {
                    break;
                }
            }
        }
        return count;
    }
    //对字符串进行自然顺序排序
    public static String stringSort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        System.out.println(StringUtil.trimOfAll("   shjansa  sa   "));
//        System.out.println(StringUtil.trim("   sh  hb  ")+"**");
        System.out.println(StringUtil.trim2("   sh  hb  ")+"**");
        System.out.println(StringUtil.reversel3("helloworld",2,6));  //heowollrld
        System.out.println(StringUtil.getCount( "abkkcadkabkebfkabkskab","ab"));
        System.out.println(StringUtil.stringSort("DCBA"));  //ABCD
    }
}
