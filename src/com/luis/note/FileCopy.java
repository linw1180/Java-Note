package com.luis.note;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Luis
 * @date: 2022/1/12 7:45
 * @description: 万能文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {
        // 文件拷贝（万能的，什么类型文件都能拷贝）
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\linwe\\Videos\\be patient to your life.mp4"); // 创建输入流对象
            fos = new FileOutputStream("D:\\temp\\be patient to your life.mp4"); // 创建输出流对象
            // 准备 byte 数组
            byte[] bytes = new byte[1024 * 1024]; // 每次读取1M大小的字节，1byte=8bit，1kb=1024byte，1m=1024kb
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                // 一边读，一边写
                fos.write(bytes);
            }
            fos.flush(); // 写完后需要清空输出流管道
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 两个流分开 try
            try {
                fis.close(); // 关闭输入流
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close(); // 关闭输出流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
