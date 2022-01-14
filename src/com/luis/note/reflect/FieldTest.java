package com.luis.note.reflect;

import java.lang.reflect.Field;

/**
 * 必须掌握：
 *      1. 通过反射修改类的属性
 *      2. 通过反射获取类的属性
 *
 * @Author: Luis
 * @date: 2022/1/14 8:49
 * @description: 反射之属性
 *  反射机制必须掌握：Method > Field > Constructor
 */
public class FieldTest {
    public static void main(String[] args) throws Exception {

        // 获取学生类的Class对象
        Class sClass = Class.forName("com.luis.note.reflect.Student");
        // 通过反射机制创建学生类对象
        Object obj = sClass.newInstance();

        // 获取学生类指定属性的Field对象
        Field ageField = sClass.getDeclaredField("age");
        // 修改对象属性
        ageField.set(obj, 20);
        // 获取对象属性
        Object o = ageField.get(obj);
        // 打印
        System.out.println(o);

        // =========== 如果需要访问和设置对象的私有属性，必须打破封装 =============
        // 获取学生类私有属性gender的Field对象
        Field genderField = sClass.getDeclaredField("gender");
        // ===== 打破封装 ====
        genderField.setAccessible(true);
        // 修改
        genderField.set(obj, true); // 如果没有打破封装，此行代码会报错
        // 访问
        System.out.println(genderField.get(obj));

    }
}
