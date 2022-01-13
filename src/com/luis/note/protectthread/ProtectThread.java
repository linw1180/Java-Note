package com.luis.note.protectthread;

/**
 * @Author: Luis
 * @date: 2022/1/13 13:16
 * @description: 守护线程
 */
public class ProtectThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        // 如果当前线程被设定为守护线程，即使下面为死循环，此守护线程也会在主线程结束后终止
        while (true) {
            System.out.println(Thread.currentThread().getName() + "------》" + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
