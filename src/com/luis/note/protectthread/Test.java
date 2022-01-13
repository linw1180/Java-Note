package com.luis.note.protectthread;

/**
 * @Author: Luis
 * @date: 2022/1/13 13:22
 * @description: 设置为守护线程方法：setDaemon()
 */
public class Test {
    public static void main(String[] args) {

        ProtectThread pt = new ProtectThread();
        pt.setName("守护线程");
        // 设置当前线程为守护线程
        // 守护线程特点：其他所有线程结束，守护线程一定会结束
        pt.setDaemon(true); // 设置为守护线程
        pt.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
