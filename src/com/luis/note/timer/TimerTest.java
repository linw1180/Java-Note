package com.luis.note.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * @Author: Luis
 * @date: 2022/1/13 13:31
 * @description: 计时器
 */
public class TimerTest {
    public static void main(String[] args) throws ParseException {

        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2022-01-13 13:45:00");
        // 指定计时计划
        // timer.schedule(计时器类，第一次执行的时间，隔多久执行一次);
        timer.schedule(new LogBackup(), firstTime, 1000 * 5);
    }
}
