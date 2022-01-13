package com.luis.note.getresource.before;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: Luis
 * @date: 2022/1/14 5:41
 * @description: 旧方式获取属性配置文件资源
 */
public class Test {
    public static void main(String[] args) {

        // ============== 改进初始版 ==========================
        // 较下面初始版：不用获取绝对路径，直接可以获取输入流

        // 获取输入流
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("com/luis/note/getresource/before/test.properties");
        // 准备属性类
        Properties properties = new Properties();
        try {
            // 加载数据
            properties.load(in);
            // 读取文件内容
            String s = properties.getProperty("test");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ============= 初始版 =============
        // // 获取属性文件绝对路径（通用）
        // String path = Thread.currentThread().getContextClassLoader()
        //         .getResource("com/luis/note/getResource/before/test.properties").getPath();
        // FileReader reader = null;
        // try {
        //     // 创建文件字符输入流
        //     reader = new FileReader(path);
        //     // 准备属性类
        //     Properties properties = new Properties();
        //     // 加载数据
        //     properties.load(reader);
        //     // 读取文件内容
        //     String s = properties.getProperty("test");
        //     System.out.println(s);
        //
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }

    }
}
