package com.luis.note.reflect;

/**
 * @Author: Luis
 * @date: 2022/1/14 11:34
 * @description: 反射之获取父类和所有实现的接口
 */
public class GetSuperClassAndInterfacesTest {
    public static void main(String[] args) throws Exception {

        // 获取Class
        Class c = Class.forName("java.lang.String");

        // 获取继承的父类（单个）
        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());

        // 获取所有实现的接口（有可能多个）
        Class[] interfaces = c.getInterfaces();
        for (Class cInterface : interfaces) {
            System.out.println(cInterface.getName());
        }
    }
}
