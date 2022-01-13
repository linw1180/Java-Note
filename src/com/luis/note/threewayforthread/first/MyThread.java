package com.luis.note.threewayforthread.first;

/**
 * @Author: Luis
 * @date: 2022/1/13 19:54
 * @description:
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程执行");
    }
}
