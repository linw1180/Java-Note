package com.luis.note;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: Luis
 * @date: 2022/1/12 20:32
 * @description: IO和Properties联用
 */
public class IOPropertiesTest {
    public static void main(String[] args) {

        // 创建输入流对象，读取属性配置文件内容
        FileReader reader = null;
        try {
            // 这里用的字符输入流，用字节输入流也行
            reader = new FileReader("coding/userinfo.properties");
            // 创建集合属性类Properties，存文件内容
            Properties properties = new Properties();
            // 调用集合属性类Properties的load()方法将文件内容存到Properties集合中
            properties.load(reader);
            // 可调用getProperty()方法通过key获取value；也可调用setProperty()通过key修改value
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
