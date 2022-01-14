package com.luis.note.reflect;

import java.lang.reflect.Method;

/**
 * 必须掌握：使用反射机制调用方法
 *
 * @Author: Luis
 * @date: 2022/1/14 10:17
 * @description: 反射之方法——最最最重要的
 * 反射机制必须掌握：Method > Field > Constructor
 */
public class MethodTest {
    public static void main(String[] args) throws Exception {

        // 获取UserService的Class
        Class uClass = Class.forName("com.luis.note.reflect.UserService");
        // 反射机制实例化对象
        Object obj = uClass.newInstance();

        // 反射机制获取UserService的login()方法对象
        Method loginMethod = uClass.getDeclaredMethod("login", String.class, String.class);
        // 反射机制调用UserService的login()方法
        loginMethod.invoke(obj, "admin", "123");

        // 反射机制获取UserService的logout()方法对象
        Method logoutMethod = uClass.getDeclaredMethod("logout");
        // 反射机制调用UserService的login()方法
        logoutMethod.invoke(obj);
    }
}
