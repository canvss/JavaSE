package com.canvs.grammar.block;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 20:52
 */
public class blockTest {
    @Test
    public void test01() {
        String index = """
                    <html>
                      <body>
                          <p>Hello World!</p>
                      </body>
                    </html>
                """;
        System.out.println(index);
    }

    @Test
    public void test02() {
        String sql = """
                SELECT id,name,email
                FROM id > 4
                ORDER BY email DESC
                """;
        System.out.println(sql);
    }

    @Test
    public void test03() {
        String json = """
                    {
                        "name":"Canvs",
                        "age":22
                    }
                """;
        System.out.println(json);
    }
    @Test
    public void test04(){
        // \:取消换行
        // \s:表示一个空格
        String sql = """
                SELECT id,name,email \
                FROM id > 4 \s\
                ORDER BY email DESC
                """;
        System.out.println(sql);
    }
}
