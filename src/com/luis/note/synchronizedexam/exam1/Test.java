package com.luis.note.synchronizedexam.exam1;

/**
 * @Author: Luis
 * @date: 2022/1/13 9:57
 * @description:
 *
 * 面试题：doOther()的执行需要等doSome()结束吗？
 *      不需要，因为doOther()没有synchronized关键字，t2不需要找锁
 */
public class Test {
    public static void main(String[] args) {

        MyClass mc = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000); // 此处睡眠1秒是为了保证t1线程先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
