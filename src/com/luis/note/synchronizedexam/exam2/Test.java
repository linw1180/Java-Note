package com.luis.note.synchronizedexam.exam2;

/**
 * @Author: Luis
 * @date: 2022/1/13 9:57
 * @description:
 *
 * 面试题：doOther()的执行需要等doSome()结束吗？
 *      需要，因为doSome()和doOther()都有synchronized关键字，一个对象只有一把锁，
 *      t1先抢占对象锁，t2需排队，等t1执行完归还对象锁后，t2才能拿到锁执行doOther()
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
