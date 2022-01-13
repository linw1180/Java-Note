package com.luis.note.threewayforthread.second;

/**
 * @Author: Luis
 * @date: 2022/1/13 20:03
 * @description:
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程执行");
    }
}
