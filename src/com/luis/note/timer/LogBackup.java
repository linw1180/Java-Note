package com.luis.note.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * @Author: Luis
 * @date: 2022/1/13 13:39
 * @description: 日志备份计时器
 */
public class LogBackup extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = sdf.format(new Date());
        System.out.println(nowTime + " 完成了一次数据备份");
    }
}
