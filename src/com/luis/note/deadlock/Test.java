package com.luis.note.deadlock;

/**
 * @Author: Luis
 * @date: 2022/1/13 10:47
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();

        // 创建两个线程对象，共享o1和o2
        Thread t1 = new Thread(new RunnableImpl1(o1, o2));
        Thread t2 = new Thread(new RunnableImpl2(o1, o2));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
