package com.luis.note;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Luis
 * @date: 2022/1/12 9:45
 * @description: 模拟简单日志打印工具
 */
public class Logger {
    public static void log(String msg) {
        try {
            // 创建标准的打印输出流（此流不需手动关闭）
            PrintStream printStream = new PrintStream(new FileOutputStream("coding/log.txt",true));
            // 改变控制台输出方向
            System.setOut(printStream);
            // 时间格式化操作
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sdf.format(new Date());
            // 日志信息打印
            System.out.println(time + ": " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
