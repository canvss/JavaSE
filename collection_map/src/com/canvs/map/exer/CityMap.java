package com.canvs.map.exer;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 15:29
 */
public class CityMap {
    static HashMap model = new HashMap();

    static {
        model.put("北京", new String[]{"北京"});
        model.put("上海", new String[]{"上海"});
        model.put("天津", new String[]{"天津"});
        model.put("重庆", new String[]{"重庆"});
        model.put("黑龙江", new String[]{"哈尔滨", "齐齐哈尔", "牡丹江", "大庆", "伊春", "双鸭山", "绥化"});
        model.put("吉林", new String[]{"长春", "延边", "吉林", "白山", "白城", "四平", "松原"});
        model.put("河北", new String[]{"石家庄", "张家口", "邯郸", "邢台", "唐山", "保定", "秦皇岛"});
    }
}

class ProvinceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set entrySet = CityMap.model.entrySet();
        for (Object o : entrySet) {
            Map.Entry m = (Map.Entry) o;
            System.out.print(m.getKey() + "\t\t");
        }
        System.out.println();
        String province;
        while (true) {
            System.out.print("请选择你所在的省份：");
            province = scan.next();
            if (CityMap.model.containsKey(province)) {
                break;
            }
            System.out.println("输入省份有误！");
        }
        String[] city = (String[]) CityMap.model.get(province);
        for (String s : city) System.out.print(s+"\t\t");
        System.out.println();
        l:while (true) {
            System.out.print("请输入你所在的城市：");
            String city1 = scan.next();
            for (String s:city){
                if (s.equals(city1)) break l;
            }

            System.out.println("输入城市有误！");
        }
        System.out.println("登记完成！");
        scan.close();
    }
}