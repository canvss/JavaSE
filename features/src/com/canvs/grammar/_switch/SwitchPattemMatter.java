package com.canvs.grammar._switch;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 18:42
 */
public class SwitchPattemMatter {
    public static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double + %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        } else {
            formatted = o.toString();
        }
        return formatted;
    }

    public static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }
}
