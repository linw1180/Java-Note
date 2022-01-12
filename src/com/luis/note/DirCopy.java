package com.luis.note;

import java.io.*;

/**
 * @Author: Luis
 * @date: 2022/1/12 17:46
 * @description: 目录拷贝
 */
public class DirCopy {
    public static void main(String[] args) {

        File srcFile = new File("D:\\temp");
        File destFile = new File("C:\\test");
        copyAll(srcFile, destFile);
    }

    public static void copyAll(File srcFile, File destFile) {

        // 终止递归条件：当前File为文件时
        if (srcFile.isFile()) {
            //region 文件拷贝
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(srcFile); // 构造方法中可传入一个File对象
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcFile.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024]; // 准备byte数组，每次复制1M
                int readCount = 0;
                while ((readCount = fis.read(bytes)) != -1) { // 一边读，一边写
                    fos.write(bytes);
                }
                fos.flush(); // 刷新输出流，清空管道
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            //endregion
            return; // 到此处终止递归
        }

        // 列出当前目录下所有子目录，存到File数组中
        File[] files = srcFile.listFiles();
        for (File file : files) {
            // 如果当前File为目录
            if (file.isDirectory()) {
                String srcDir = file.getAbsolutePath();
                // 目标目录和源目录路径字符串拼接
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDir.substring(3);
                File newFile = new File(destDir);
                // 进行目录拷贝
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            // 递归调用
            copyAll(file, destFile);
        }
    }
}
