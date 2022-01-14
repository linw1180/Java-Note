package com.luis.note.reflect;

import java.lang.reflect.Constructor;

/**
 * 通过反射机制调用对象的构造方法实例化对象
 *
 * 最好掌握，虽然不是重点，重点是 Method 和 Field
 * 通过反射调用方法、设置属性、修改属性，必须掌握！
 *
 * @Author: Luis
 * @date: 2022/1/14 11:01
 * @description: 反射之构造方法
 */
public class ConstructorTest {
    public static void main(String[] args) throws Exception{

        // 获取对象的Class
        Class uClass = Class.forName("com.luis.note.reflect.User");

        // 获取User对象指定的有参构造Constructor对象
        Constructor con = uClass.getDeclaredConstructor(String.class, int.class, boolean.class); // 区分构造方法是通过比较形参列表
        // 实例化对象——通过调用有参构造
        Object o1 = con.newInstance("luis", 24, true);
        System.out.println(o1);

        // 实例化对象——通过调用无参构造
        // 方式一：直接通过获取的User的Class对象实例化对象
        Object o2 = uClass.newInstance();
        System.out.println(o2);
        // 方式二：通过获取的User的Constructor对象实例化对象
        // 获取User对象指定的无参构造Constructor对象
        Constructor con2 = uClass.getDeclaredConstructor(); // 因为是无参构造，所以不用传参
        // 实例化对象
        Object o3 = con2.newInstance();
        System.out.println(o3);
    }
}
