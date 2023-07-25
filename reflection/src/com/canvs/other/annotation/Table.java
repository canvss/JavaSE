package com.canvs.other.annotation;

import java.lang.annotation.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 20:13
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Column{
    String columnName();
    String columnType();
}