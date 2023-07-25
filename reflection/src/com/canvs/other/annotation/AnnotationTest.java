package com.canvs.other.annotation;

import java.lang.reflect.Field;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 20:20
 */
public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.canvs.other.annotation.Student");
        Table table = clazz.getDeclaredAnnotation(Table.class);
        if (table != null) System.out.println(table.value());
        Field[] fields = clazz.getDeclaredFields();
        String[] columns = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            Column column = fields[i].getAnnotation(Column.class);
            if (column != null) columns[i] = column.columnName();
        }
        String sql = "select ";
        for (int i = 0; i < columns.length; i++) {
            sql += columns[i];
            if (i<columns.length-1) sql+=",";
        }
        sql += " from "+table.value();
        System.out.println(sql);
    }
}
