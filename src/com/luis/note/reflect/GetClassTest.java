package com.luis.note.reflect;

import java.util.Date;

/**
 * 获取Class的三种方式：
 *      1. Class c = Class.forName("完整类名带包名")   调用静态方法
 *      2. Class c = 对象.getClass()                 调用实例方法
 *      3. Class c = 类型.class                      通过属性获取
 *
 * @Author: Luis
 * @date: 2022/1/14 11:23
 * @description: 获取Class的三种方式
 */
public class GetClassTest {
    public static void main(String[] args) throws Exception {

        // 方式一：Class c = Class.forName("完整类名带包名")   调用静态方法
        Class c1 = Class.forName("java.lang.String");
        System.out.println(c1);

        // 方式二：Class c = 对象.getClass()                 调用实例方法
        Date date = new Date();
        Class c2 = date.getClass();
        System.out.println(c2);

        // 方式三：Class c = 类型.class                      通过属性获取
        Class c3 = Thread.class;
        System.out.println(c3);
    }
}
