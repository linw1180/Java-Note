package com.luis.note.threewayforthread.first;

/**
 * @Author: Luis
 * @date: 2022/1/13 19:52
 * @description:
 * 实现多线程的第一种方式：继承 Thread 类，重写 run()方法
 * 缺点：占用继承位置，扩展性比第二种实现接口差
 */
public class Test {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        mt.setName("mt");
        mt.start();

        System.out.println(Thread.currentThread().getName() + "线程执行");
    }
}
