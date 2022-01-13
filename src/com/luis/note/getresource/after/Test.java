package com.luis.note.getresource.after;

import java.util.ResourceBundle;

/**
 * @Author: Luis
 * @date: 2022/1/14 6:28
 * @description: 官方提供专门读取属性配置文件方式——通过资源绑定器 ResourceBundle
 * 要求：
 *      1. 属性配置文件必须放在类路径下
 *      2. 属性配置文件必须以 .properties 结尾
 *      3. 写属性配置文件路径时不带 .properties 路径
 */
public class Test {
    public static void main(String[] args) {

        // 获取资源绑定器对象
        ResourceBundle bundle = ResourceBundle.getBundle("com/luis/note/getresource/after/test");
        // 通过 key 获取 value
        String s = bundle.getString("test");
        System.out.println(s);
    }
}
